package com.study.demo.controller;

import com.google.gson.Gson;
import com.study.demo.entity.PageResult;
import com.study.demo.entity.Result;
import com.study.demo.entity.User;
import com.study.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DemoController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String sayHello(){
        return "好好学习，天天向上";
    }


    @GetMapping("/getUser")
    public Result getUserInfo(@RequestParam("currentPage") Integer currentPage,@RequestParam("pageSize") Integer pageSize){
        List<User> userList = userService.getUserInfo();
        List<User> users = userList.stream().sorted(Comparator.comparing(User::getCreatetime).reversed()).skip((currentPage-1) * pageSize).limit(pageSize).collect(Collectors.toList());

        PageResult<User> pageResult = new PageResult<>();
        pageResult.setTotal(userList.size());
        pageResult.setData(users);

        Result result = new Result();
        result.setCode(200);
        result.setData(pageResult);
        return result;
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        Result result = new Result();
        String token = "asdfhakjsdhf";
        result.setCode(200);
        result.setData(token);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(user);
        redisTemplate.opsForValue().set(token,jsonStr);
        return result;
    }


}

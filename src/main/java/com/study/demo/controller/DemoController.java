package com.study.demo.controller;

import com.study.demo.entity.User;
import com.study.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String sayHello(){
        return "好好学习，天天向上";
    }


    @GetMapping("/getUser")
    public List<User> getUserInfo(){
        return userService.getUserInfo();
    }
}

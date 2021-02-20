package com.study.demo.service.impl;

import com.study.demo.common.BizException;
import com.study.demo.common.UserContext;
import com.study.demo.dao.UserDao;
import com.study.demo.entity.User;
import com.study.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserInfo() {
        User user = UserContext.getUser();
        return userDao.queryUser();
    }

    @Override
    public void addUser(User user) {
        User user1 = userDao.findUserByName(user.getName());
        if(user1==null){
            userDao.addUser(user);
        }else{
            throw new BizException(100,"用户名已存在");
        }

    }

    @Override
    public void login(User user) {
        User user1 = userDao.findUserByName(user.getName());
        if(user1==null){
            throw new BizException(100,"用户名不存在");
        }else{
            if(!user.getPassword().equals(user1.getPassword())){
                throw new BizException(100,"密码不正确");
            }
        }
    }


}

package com.study.demo.service.impl;

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
}

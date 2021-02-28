package com.study.demo.service;

import com.study.demo.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUserInfo();

    public void addUser(User user);

    public User login(User user);
}

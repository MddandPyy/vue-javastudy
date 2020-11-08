package com.study.demo.dao;

import com.study.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
    List<User> queryUser();
}

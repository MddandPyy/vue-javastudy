package com.study.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;

    private String name;

    private Integer age;

    private Date createtime;
}

package com.study.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class SocketResult {
    private List<User> userNames;
    private String message;
}

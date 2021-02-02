package com.study.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//生成一个无参的构造函数
@NoArgsConstructor
//生成一个带所有属性的构造函数
@AllArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;
}

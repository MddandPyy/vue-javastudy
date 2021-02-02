package com.study.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {

    private Integer total;

    private List<T> data;
}


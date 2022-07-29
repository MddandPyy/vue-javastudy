package com.study.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Commodity {
    private Integer id;

    private String commodityName;

    private String commodityCode;

    private String price;

}

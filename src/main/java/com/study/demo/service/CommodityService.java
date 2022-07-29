package com.study.demo.service;

import com.study.demo.entity.Commodity;

import java.util.List;

public interface CommodityService {
    public List<Commodity> getCommodityInfoByCode(String code);
}

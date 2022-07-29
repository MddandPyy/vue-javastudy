package com.study.demo.dao;

import com.study.demo.entity.Commodity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CommodityDao {
    List<Commodity> getCommodityInfoByCode(String code);
}

package com.study.demo.service.impl;

import com.study.demo.dao.CommodityDao;
import com.study.demo.dao.UserDao;
import com.study.demo.entity.Commodity;
import com.study.demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityDao commodityDao;


    @Override
    public List<Commodity> getCommodityInfoByCode(String code) {
        return commodityDao.getCommodityInfoByCode("%"+code+"%");
    }
}

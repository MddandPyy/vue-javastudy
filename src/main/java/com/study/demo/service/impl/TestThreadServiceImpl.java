package com.study.demo.service.impl;

import com.study.demo.service.TestThreadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;



@Service
public class TestThreadServiceImpl implements TestThreadService {

    private static final Logger logger = LoggerFactory.getLogger(TestThreadServiceImpl.class);

    @Async("taskExecutor")
    @Override
    public void exe(String name) {

        try {
            logger.info(name+"开始执行");
            Thread.sleep(5000);
            logger.info(name+"执行结束");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

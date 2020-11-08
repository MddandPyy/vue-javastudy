package com.study.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.study.demo.dao")
public class StudydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudydemoApplication.class, args);
    }

}

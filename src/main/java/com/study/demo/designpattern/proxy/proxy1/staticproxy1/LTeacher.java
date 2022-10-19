package com.study.demo.designpattern.proxy.proxy1.staticproxy1;

public class LTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("老师正在授课");
    }
}

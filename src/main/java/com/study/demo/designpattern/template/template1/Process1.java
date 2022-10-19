package com.study.demo.designpattern.template.template1;

public class Process1 extends ProcessTemplate {
    @Override
    void operation(String operType) {
        System.out.println(super.getName()+",正在执行操作"+operType);
    }
}

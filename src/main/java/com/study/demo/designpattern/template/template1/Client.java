package com.study.demo.designpattern.template.template1;

public class Client {
    public static void main(String[] args) {
        ProcessTemplate process1 = new Process1();
        process1.auto("工单1");
        //process1.start("工单1");
    }
}

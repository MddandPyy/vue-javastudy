package com.study.demo.designpattern.bridge.bridge2;

public class PhoneBCall implements PhoneA {
    @Override
    public void run() {
        System.out.println("B手机打电话");
    }
}

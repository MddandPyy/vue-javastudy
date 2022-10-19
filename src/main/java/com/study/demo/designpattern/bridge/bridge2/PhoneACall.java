package com.study.demo.designpattern.bridge.bridge2;

public class PhoneACall implements PhoneA {
    @Override
    public void run() {
        System.out.println("A手机打电话");
    }
}

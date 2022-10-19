package com.study.demo.designpattern.bridge.bridge2;

public class PhoneBGame implements PhoneA {
    @Override
    public void run() {
        System.out.println("B手机玩游戏");
    }
}

package com.study.demo.designpattern.bridge.bridge2.improve;

public class PhoneB implements Phone {
    @Override
    public void run(Sofeware sofeware) {
        System.out.println("B手机");
        sofeware.run();
    }
}

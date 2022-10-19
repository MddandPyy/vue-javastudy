package com.study.demo.designpattern.bridge.bridge2.improve;

public class PhoneA implements Phone {
    @Override
    public void run(Sofeware sofeware) {
        System.out.println("A手机");
        sofeware.run();
    }
}

package com.study.demo.designpattern.bridge.bridge2.improve;

public class Client {
    public static void main(String[] args) {
        Phone phone = new PhoneA();
        phone.run(new Game());

        Phone phone2 = new PhoneB();
        phone2.run(new Call());
    }
}

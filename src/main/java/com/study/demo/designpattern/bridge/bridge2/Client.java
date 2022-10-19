package com.study.demo.designpattern.bridge.bridge2;

public class Client {
    public static void main(String[] args) {
        Phone phone = new PhoneAGame();
        phone.run();

        Phone phone2 = new PhoneBGame();
        phone2.run();

    }

}

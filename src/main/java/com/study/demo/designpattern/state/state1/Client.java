package com.study.demo.designpattern.state.state1;

public class Client {
    public static void main(String[] args) {
        Person person = new Person();
//        person.setAge(25);
//        person.run();

        for (int i = 0; i < 25; i++) {
            person.setAge(i);
            person.run();

        }
    }
}

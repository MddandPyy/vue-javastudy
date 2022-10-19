package com.study.demo.designpattern.state.state2;

public class Client {
    public static void main(String[] args) {
        Person person = new Person();
//        person.setAge(25);
//        person.run();

//        for (int i = 0; i < 25; i++) {
//            person.setAge(i);
//            person.run();
//
//        }

        person.setAge(25);
        person.run();

        person.setAge(10);
        person.run();

        person.setAge(5);
        person.run();

    }
}

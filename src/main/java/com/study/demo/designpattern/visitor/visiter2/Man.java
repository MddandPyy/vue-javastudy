package com.study.demo.designpattern.visitor.visiter2;

public class Man extends Person {
    @Override
    void accept(Action action) {
        System.out.println("第二次分派");
        action.manOperation(this);
    }
}

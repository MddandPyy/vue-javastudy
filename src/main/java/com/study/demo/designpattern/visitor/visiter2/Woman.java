package com.study.demo.designpattern.visitor.visiter2;

public class Woman extends Person {
    @Override
    void accept(Action action) {
        System.out.println("第二次分派");
        action.womanOperation(this);
    }
}

package com.study.demo.designpattern.visitor.visiter1;

public class Operation2 implements Action {
    @Override
    public void manOperation(Person person) {
        System.out.println(person.getName()+"增加了操作2");
    }

}

package com.study.demo.designpattern.visitor.visiter2;

public class Operation2 implements Action {
    @Override
    public void manOperation(Person person) {
        System.out.println(person.getName()+"增加了操作2");
    }

    @Override
    public void womanOperation(Person person) {
        System.out.println(person.getName()+"增加了女人操作2");
    }

}

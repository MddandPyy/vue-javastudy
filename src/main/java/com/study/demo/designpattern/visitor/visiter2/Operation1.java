package com.study.demo.designpattern.visitor.visiter2;

public class Operation1 implements Action {
    @Override
    public void manOperation(Person person) {
        System.out.println(person.getName()+"增加了男人操作1");
    }

    @Override
    public void womanOperation(Person person) {
        System.out.println(person.getName()+"增加了女人操作1");
    }

}

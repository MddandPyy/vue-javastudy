package com.study.demo.designpattern.visitor.visiter1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Person> list  = new ArrayList<>();
        Person person1 = new Man();
        person1.setName("小明");
        list.add(person1);
        Person person2 = new Man();
        person2.setName("小东");
        list.add(person2);
        Person person3 = new Man();
        person3.setName("小王");
        list.add(person3);



        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.visiter(list,new Operation1());
        System.out.println("------------------");
        objectStructure.visiter(list,new Operation1());

    }
}

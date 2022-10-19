package com.study.demo.designpattern.visitor.visiter2;

import java.util.List;

public class ObjectStructure {

    public void visiter(List<Person> list , Action action){
        for (Person p :list) {
            System.out.println("第一次分派");
            p.accept(action);
        }
    }

}

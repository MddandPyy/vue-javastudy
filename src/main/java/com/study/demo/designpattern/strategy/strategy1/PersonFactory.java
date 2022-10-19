package com.study.demo.designpattern.strategy.strategy1;

import java.util.ArrayList;
import java.util.List;

public class PersonFactory {

    public Person getPerson(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(name);
        Person o = (Person)aClass.newInstance();
        return o;
    }

    List<Person> list = new ArrayList<>();

    PersonFactory(){
        list.add(new XiaoHong());
        list.add(new XiaoMing());
    }

    public Person getPerson1(String name){
        for (Person p:list) {
            if(p.match(name)){
                return p;
            }
        }
        return null;
    }

}

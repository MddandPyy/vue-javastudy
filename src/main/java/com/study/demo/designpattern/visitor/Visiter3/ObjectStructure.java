package com.study.demo.designpattern.visitor.Visiter3;

import com.study.demo.designpattern.visitor.visiter1.Action;
import com.study.demo.designpattern.visitor.visiter1.Person;

import java.util.List;

public class ObjectStructure {

    public void visiter(List<Home> list ,ZhuangXiuGongsi action){
        for (Home home :list) {
            System.out.println("去家里考察");
            home.accept(action);
        }
    }

}

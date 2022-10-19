package com.study.demo.designpattern.visitor.Visiter3;


import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Home> list  = new ArrayList<>();
        Home home1 = new DaHome();
        Home home2 = new ZhongHome();
        Home home3 = new XiaoHome();
        list.add(home1);
        list.add(home2);
        list.add(home3);

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.visiter(list,new Kongtiao());
        System.out.println("------------");
        objectStructure.visiter(list,new Yugang());
    }
}

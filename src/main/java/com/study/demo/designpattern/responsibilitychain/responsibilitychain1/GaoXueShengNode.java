package com.study.demo.designpattern.responsibilitychain.responsibilitychain1;

public class GaoXueShengNode extends Node {

    GaoXueShengNode(){
        super("高学生节点");
    }

    @Override
    void processRequest(PersonRequest request) {
        System.out.println("进入高学生节点");
        int age = request.getAge();
        if(age>=15&&age<18){
            System.out.println("高学生阶段，上高中");
        }else{
            node.processRequest(request);
        }
    }
}

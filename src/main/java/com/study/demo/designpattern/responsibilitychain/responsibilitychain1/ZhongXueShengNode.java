package com.study.demo.designpattern.responsibilitychain.responsibilitychain1;

public class ZhongXueShengNode extends Node {

    ZhongXueShengNode(){
        super("中学生节点");
    }

    @Override
    void processRequest(PersonRequest request) {
        System.out.println("进入中学生节点");
        int age = request.getAge();
        if(age>=11&&age<15){
            System.out.println("中学生阶段，上初中");
        }else{
            node.processRequest(request);
        }
    }
}

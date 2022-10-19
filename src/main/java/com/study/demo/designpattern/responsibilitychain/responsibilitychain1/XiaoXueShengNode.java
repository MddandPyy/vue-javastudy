package com.study.demo.designpattern.responsibilitychain.responsibilitychain1;

public class XiaoXueShengNode extends Node {

    XiaoXueShengNode(){
        super("小学生节点");
    }

    @Override
    void processRequest(PersonRequest request) {
        System.out.println("进入小学生节点");
        int age = request.getAge();
        if(age>=6&&age<11){
            System.out.println("小学生阶段，上小学");
        }else{
            node.processRequest(request);
        }
    }
}

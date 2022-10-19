package com.study.demo.designpattern.responsibilitychain.responsibilitychain1;

public class DaXueShengNode extends Node {

    DaXueShengNode(){
        super("大学生节点");
    }

    @Override
    void processRequest(PersonRequest request) {
        System.out.println("进入大学生节点");
        int age = request.getAge();
        if(age>=18&&age<22){
            System.out.println("大学生阶段，上大学");
        }else{
            node.processRequest(request);
        }
    }
}

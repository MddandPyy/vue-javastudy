package com.study.demo.designpattern.responsibilitychain.responsibilitychain1;

public class DaRenNode extends Node {

    DaRenNode(){
        super("大人节点");
    }

    @Override
    void processRequest(PersonRequest request) {
        System.out.println("进入大人节点");
        int age = request.getAge();
        if(age>=22){
            System.out.println("大学毕业了，踏入社会了");
        }else{
            node.processRequest(request);
        }
    }
}

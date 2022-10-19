package com.study.demo.designpattern.responsibilitychain.responsibilitychain1;

public class XiaoHaiNode extends Node {

    XiaoHaiNode(){
        super("小孩节点");
    }


    @Override
    void processRequest(PersonRequest request) {
        System.out.println("进入小孩节点");
        int age = request.getAge();
        if(age>=0&&age<6){
            System.out.println("小孩阶段，就是玩");
        }else{
            node.processRequest(request);
        }
    }
}

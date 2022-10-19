package com.study.demo.designpattern.composite.composite1;

public class ShiOrganization implements Organization {

    private String name;

    ShiOrganization(String name){
        this.name = name;
    }


    @Override
    public void tongzhi() {
        System.out.println(this.name+"收到通知，并开始打扫卫生");
    }

    @Override
    public void zhixing() {
        System.out.println(this.name+"被检查卫生");
    }



}

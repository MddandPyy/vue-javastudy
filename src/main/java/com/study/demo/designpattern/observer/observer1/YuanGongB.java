package com.study.demo.designpattern.observer.observer1;

public class YuanGongB implements Observer {
    private String name;

    YuanGongB(String name){
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name+"接收到消息，处理消息");
    }


}

package com.study.demo.designpattern.strategy.strategy1;

public class XiaoMing extends Person {

    XiaoMing(){
        chiStrategy = new Mantou();
        chuanStrategy = new Lan();
    }

    @Override
    public void showName() {
        System.out.println("我是小明");
    }


    @Override
    public Boolean match(String name) {
        return "xiaoming".equals(name);
    }
}

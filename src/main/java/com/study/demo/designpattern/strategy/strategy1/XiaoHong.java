package com.study.demo.designpattern.strategy.strategy1;

public class XiaoHong extends Person {

    XiaoHong(){
        chiStrategy = new Mian();
        chuanStrategy = new Hong();
    }

    @Override
    public void showName() {
        System.out.println("我是小红");
    }

    @Override
    public Boolean match(String name) {
        return "xiaohong".equals(name);
    }


}

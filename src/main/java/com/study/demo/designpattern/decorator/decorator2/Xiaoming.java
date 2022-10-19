package com.study.demo.designpattern.decorator.decorator2;

public class Xiaoming implements Person {
    private String name = "xiaoming";

    private String yifu;

    public String getYifu() {
        return yifu;
    }

    public void setYifu(String yifu) {
        this.yifu = yifu;
    }

    @Override
    public void show() {
        System.out.println(name +"穿了："+ yifu);
    }


}

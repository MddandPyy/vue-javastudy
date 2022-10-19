package com.study.demo.designpattern.decorator.decorator2;

public class Client {
    public static void main(String[] args) {
        Person xm = new Xiaoming();
        xm = new ShangyiDecorator(xm);
        xm.show();
        xm = new KuziDecorator(xm);
        xm.show();
        xm = new WaitaoDecorator(xm);
        xm.show();
    }
}

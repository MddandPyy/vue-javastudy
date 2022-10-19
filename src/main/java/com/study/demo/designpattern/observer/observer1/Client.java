package com.study.demo.designpattern.observer.observer1;

public class Client {
    public static void main(String[] args) {
        YuanGongA yuanGongA = new YuanGongA("员工A");
        YuanGongB yuanGongB = new YuanGongB("员工B");
        QianTai qianTai = new QianTai();
        //给前台买零食，拜托她帮忙看老板是否到来
        qianTai.addObserver(yuanGongA);
        qianTai.addObserver(yuanGongB);

        //老板来了
        System.out.println("老板来了");
        qianTai.notifyObserver();
    }
}

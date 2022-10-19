package com.study.demo.designpattern.visitor.Visiter3;

public class Kongtiao implements ZhuangXiuGongsi {
    @Override
    public void da(Home home) {
        System.out.println("安装大空调");
    }

    @Override
    public void zhong(Home home) {
        System.out.println("安装中空调");
    }

    @Override
    public void xiao(Home home) {
        System.out.println("安装小空调");
    }
}

package com.study.demo.designpattern.visitor.Visiter3;

public class Yugang implements ZhuangXiuGongsi {
    @Override
    public void da(Home home) {
        System.out.println("安装大浴缸");
    }

    @Override
    public void zhong(Home home) {
        System.out.println("安装中浴缸");
    }

    @Override
    public void xiao(Home home) {
        System.out.println("安装小浴缸");
    }
}

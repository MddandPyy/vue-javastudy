package com.study.demo.designpattern.responsibilitychain.responsibilitychain1;

public class Client {
    public static void main(String[] args) {
        PersonRequest person = new PersonRequest();
        person.setAge(30);

        DaRenNode daRenNode = new DaRenNode();
        DaXueShengNode daXueShengNode = new DaXueShengNode();
        GaoXueShengNode gaoXueShengNode = new GaoXueShengNode();
        ZhongXueShengNode zhongXueShengNode = new ZhongXueShengNode();
        XiaoXueShengNode xiaoXueShengNode = new XiaoXueShengNode();
        XiaoHaiNode xiaoHaiNode = new XiaoHaiNode();

        daXueShengNode.setNode(daRenNode);
        gaoXueShengNode.setNode(daXueShengNode);
        zhongXueShengNode.setNode(gaoXueShengNode);
        xiaoXueShengNode.setNode(zhongXueShengNode);
        xiaoHaiNode.setNode(xiaoXueShengNode);

        xiaoHaiNode.processRequest(person);

    }
}

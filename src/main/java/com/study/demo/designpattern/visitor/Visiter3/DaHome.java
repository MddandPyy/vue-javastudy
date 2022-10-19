package com.study.demo.designpattern.visitor.Visiter3;

public class DaHome implements Home {
    @Override
    public void accept(ZhuangXiuGongsi zhuangXiuGongsi) {
        System.out.println("来一看，是大房子啊,得安装大的");
        zhuangXiuGongsi.da(this);
    }
}

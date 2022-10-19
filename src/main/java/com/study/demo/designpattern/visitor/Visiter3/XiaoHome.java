package com.study.demo.designpattern.visitor.Visiter3;

public class XiaoHome implements Home {
    @Override
    public void accept(ZhuangXiuGongsi zhuangXiuGongsi) {
        System.out.println("来一看，是小房子啊,得安装小的");
        zhuangXiuGongsi.xiao(this);
    }
}

package com.study.demo.designpattern.visitor.Visiter3;

public class ZhongHome implements Home {
    @Override
    public void accept(ZhuangXiuGongsi zhuangXiuGongsi) {
        System.out.println("来一看，是中房子啊,得安装中的");
        zhuangXiuGongsi.zhong(this);
    }
}

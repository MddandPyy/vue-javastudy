package com.study.demo.designpattern.composite.composite1;

public class Client {
    public static void main(String[] args) {
        Organization zongbu = new ZongBuOrganization("全国总部");
        Organization shandong = new ShengOrganization("山东省分部");
        Organization beijing = new ShengOrganization("北京分部");
        Organization yantai1 = new ShiOrganization("烟台1分店");
        Organization yantai2 = new ShiOrganization("烟台2分店");
        Organization yantai3 = new ShiOrganization("烟台3分店");
        Organization shunyi1 = new ShiOrganization("顺义1分店");
        Organization shunyi2 = new ShiOrganization("顺义2分店");

        shandong.add(yantai1);
        shandong.add(yantai2);
        shandong.add(yantai3);

        beijing.add(shunyi1);
        beijing.add(shunyi2);

        zongbu.add(shandong);
        zongbu.add(beijing);

        zongbu.tongzhi();

        //通知下达后，检查卫生之前烟台3分店关闭了
        shandong.remove(yantai3);
        zongbu.zhixing();


    }
}

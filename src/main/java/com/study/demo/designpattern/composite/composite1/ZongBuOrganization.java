package com.study.demo.designpattern.composite.composite1;

import java.util.ArrayList;
import java.util.List;

public class ZongBuOrganization implements Organization {

    private String name;

    private List<Organization> organizations = new ArrayList<>();

    ZongBuOrganization(String name){
        this.name = name;
    }


    @Override
    public void tongzhi() {
        System.out.println("--------------"+this.name+"开始通知-------------");
        for (Organization organization:organizations) {
            organization.tongzhi();
        }
    }

    @Override
    public void zhixing() {
        System.out.println("--------------"+this.name+"开始执行-------------");
        for (Organization organization:organizations) {
            organization.zhixing();
        }
    }

    @Override
    public void add(Organization organization) {
        organizations.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        organizations.remove(organization);
    }

}

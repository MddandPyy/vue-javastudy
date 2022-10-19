package com.study.demo.designpattern.proxy.proxy1.staticproxy1;

public class LTeacherProxy implements Teacher{
    private Teacher target;

    //大部分情况，此处的被代理者对象，是由spring容器创建，并注入此处
    LTeacherProxy(){
        target = new LTeacher();
    }


    @Override
    public void teach() {
        System.out.println("开始代理");
        target.teach();
        System.out.println("结束代理");
    }
}

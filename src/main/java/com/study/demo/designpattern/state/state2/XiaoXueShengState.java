package com.study.demo.designpattern.state.state2;

public class XiaoXueShengState implements State {
    private Person person;

    XiaoXueShengState(Person person){
        this.person = person;
    }


    @Override
    public void Handle() {
        System.out.println("进入小学生状态类");
        if(person.getAge()<11){
            System.out.println("小学生阶段，上小学");
            System.out.println("-------------------");
        }else{
            person.setState(new ZhongXueShengState(person));
            person.run();
        }
    }
}

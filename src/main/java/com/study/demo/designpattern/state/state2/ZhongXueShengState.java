package com.study.demo.designpattern.state.state2;

public class ZhongXueShengState implements State {
    private Person person;

    ZhongXueShengState(Person person){
        this.person = person;
    }


    @Override
    public void Handle() {
        System.out.println("进入中学生状态类");
        if(person.getAge()<15){
            System.out.println("中学生阶段，上初中学");
            System.out.println("-------------------");
        }else{
            person.setState(new GaoXueShengState(person));
            person.run();
        }
    }
}

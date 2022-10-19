package com.study.demo.designpattern.state.state2;

public class GaoXueShengState implements State {
    private Person person;

    GaoXueShengState(Person person){
        this.person = person;
    }


    @Override
    public void Handle() {
        System.out.println("进入高中生状态类");
        if(person.getAge()<18){
            System.out.println("高中学生阶段，上高中学");
            System.out.println("-------------------");
        }else{
            person.setState(new DaXueShengState(person));
            person.run();
        }
    }
}

package com.study.demo.designpattern.state.state1;

public class XiaoXueShengState implements State {
    private Person person;

    XiaoXueShengState(Person person){
        this.person = person;
    }


    @Override
    public void Handle() {
        if(person.getAge()<11){
            System.out.println("小学生阶段，上小学");
        }else{
            person.setState(new ZhongXueShengState(person));
            person.run();
        }
    }
}

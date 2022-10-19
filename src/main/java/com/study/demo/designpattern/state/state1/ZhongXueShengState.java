package com.study.demo.designpattern.state.state1;

public class ZhongXueShengState implements State {
    private Person person;

    ZhongXueShengState(Person person){
        this.person = person;
    }


    @Override
    public void Handle() {
        if(person.getAge()<15){
            System.out.println("中学生阶段，上初中学");
        }else{
            person.setState(new GaoXueShengState(person));
            person.run();
        }
    }
}

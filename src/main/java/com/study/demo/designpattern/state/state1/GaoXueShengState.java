package com.study.demo.designpattern.state.state1;

public class GaoXueShengState implements State {
    private Person person;

    GaoXueShengState(Person person){
        this.person = person;
    }


    @Override
    public void Handle() {
        if(person.getAge()<18){
            System.out.println("高中学生阶段，上高中学");
        }else{
            person.setState(new DaXueShengState(person));
            person.run();
        }
    }
}

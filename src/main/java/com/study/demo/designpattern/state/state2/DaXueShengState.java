package com.study.demo.designpattern.state.state2;

public class DaXueShengState implements State {
    private Person person;

    DaXueShengState(Person person){
        this.person = person;
    }


    @Override
    public void Handle() {
        System.out.println("进入大学生状态类");
        if(person.getAge()<22){
            System.out.println("大学生阶段，上大学");
            System.out.println("-------------------");
        }else{
            person.setState(new DaRenState(person));
            person.run();
        }
    }
}

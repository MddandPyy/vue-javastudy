package com.study.demo.designpattern.state.state1;

public class DaXueShengState implements State {
    private Person person;

    DaXueShengState(Person person){
        this.person = person;
    }


    @Override
    public void Handle() {
        if(person.getAge()<21){
            System.out.println("大学生阶段，上大学");
        }else{
            person.setState(new DaRenState(person));
            person.run();
        }
    }
}

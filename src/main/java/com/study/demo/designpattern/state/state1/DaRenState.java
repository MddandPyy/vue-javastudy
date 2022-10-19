package com.study.demo.designpattern.state.state1;

public class DaRenState implements State {
    private Person person;

    DaRenState(Person person){
        this.person = person;
    }


    @Override
    public void Handle() {

            System.out.println("大学毕业了，踏入社会了");

    }
}

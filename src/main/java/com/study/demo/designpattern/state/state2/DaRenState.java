package com.study.demo.designpattern.state.state2;

public class DaRenState implements State {
    private Person person;

    DaRenState(Person person){
        this.person = person;
    }


    @Override
    public void Handle() {
        System.out.println("进入大人状态类");
        if(person.getAge()>=22){
            System.out.println("大学毕业了，踏入社会了");
            System.out.println("-------------------");
        }else{
            person.setState(new XiaoHaiState(person));
            person.run();
        }



    }
}

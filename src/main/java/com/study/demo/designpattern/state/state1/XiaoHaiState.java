package com.study.demo.designpattern.state.state1;

public class XiaoHaiState implements State {

    private Person person;

    XiaoHaiState(Person person){
        this.person = person;
    }

    @Override
    public void Handle() {
        if(person.getAge()<6){
            System.out.println("孩子阶段，就是玩");
        }else{
            person.setState(new XiaoXueShengState(person));
            person.run();
        }
    }
}

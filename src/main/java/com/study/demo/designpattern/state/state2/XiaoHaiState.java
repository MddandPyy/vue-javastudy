package com.study.demo.designpattern.state.state2;

public class XiaoHaiState implements State {

    private Person person;

    XiaoHaiState(Person person){
        this.person = person;
    }

    @Override
    public void Handle() {
        System.out.println("进入小孩状态类");
        if(person.getAge()<6){
            System.out.println("孩子阶段，就是玩");
            System.out.println("-------------------");
        }else{
            person.setState(new XiaoXueShengState(person));
            person.run();
        }
    }
}

package com.study.demo.designpattern.state.state2;

public class Person {
    public void setState(State state) {
        this.state = state;
    }

    private State state;



    Person(){
        state = new XiaoHaiState(this);
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void run(){
        state.Handle();
    }
}

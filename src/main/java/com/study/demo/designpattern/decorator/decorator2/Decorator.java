package com.study.demo.designpattern.decorator.decorator2;

public class Decorator implements Person {

    private Person person;

    Decorator(Person person){
        this.person = person;
    }


    @Override
    public void setYifu(String yifu) {
        person.setYifu(yifu);
    }

    @Override
    public String getYifu() {
        return person.getYifu();
    }

    @Override
    public void show() {
        person.show();
    }
}

package com.study.demo.designpattern.visitor.visiter1;

public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void accept(Action action);
}

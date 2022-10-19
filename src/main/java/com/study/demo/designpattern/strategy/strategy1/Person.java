package com.study.demo.designpattern.strategy.strategy1;

public abstract class Person {
    protected ChiStrategy chiStrategy;
    protected ChuanStrategy chuanStrategy;


    public abstract void showName();

    public abstract Boolean match(String name);

    public void chi(){
       chiStrategy.chi();
    }

    public void Chuan(){
       chuanStrategy.chuan();
    }


    public void setChiStrategy(ChiStrategy chiStrategy) {
        this.chiStrategy = chiStrategy;
    }

    public void setChuanStrategy(ChuanStrategy chuanStrategy) {
        this.chuanStrategy = chuanStrategy;
    }
}

package com.study.demo.designpattern.flyweight.flyweight1;

public class Sql {
    private String value;

    Sql(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

package com.study.demo.designpattern.decorator.decorator2;

public class KuziDecorator extends Decorator {

    KuziDecorator(Person person){
       super(person);
        String yifu = super.getYifu();
        if(yifu==null){
            super.setYifu("裤子");
        }else{
            super.setYifu(yifu+"，裤子");
        }
    }

}

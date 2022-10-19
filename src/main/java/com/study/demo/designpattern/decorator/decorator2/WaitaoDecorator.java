package com.study.demo.designpattern.decorator.decorator2;

public class WaitaoDecorator extends Decorator {
    WaitaoDecorator(Person person){
        super(person);
        String yifu = super.getYifu();
        if(yifu==null){
            super.setYifu("外套");
        }else{
            super.setYifu(yifu+"，外套");
        }
    }
}

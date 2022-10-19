package com.study.demo.designpattern.decorator.decorator2;

public class ShangyiDecorator extends Decorator {
    ShangyiDecorator(Person person){
        super(person);
        String yifu = super.getYifu();
        if(yifu==null){
            super.setYifu("上衣");
        }else{
            super.setYifu(yifu+"，上衣");
        }
    }

}

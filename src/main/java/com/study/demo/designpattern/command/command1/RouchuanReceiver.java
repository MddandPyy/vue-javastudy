package com.study.demo.designpattern.command.command1;

/**
 * 烤肉串的师傅
 */
public class RouchuanReceiver implements Receiver {
    @Override
    public void start() {
        System.out.println("肉串师傅开始烤肉串");
    }

    @Override
    public void end() {
        System.out.println("肉串师傅取消烤肉串");
    }
}

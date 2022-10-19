package com.study.demo.designpattern.command.command1;

/**
 * 烤翅的师傅
 */
public class KaochiReceiver implements Receiver {
    @Override
    public void start() {
        System.out.println("烤翅师傅开始烤翅");
    }

    @Override
    public void end() {
        System.out.println("烤翅师傅取消烤翅");
    }
}

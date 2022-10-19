package com.study.demo.designpattern.command.command1;

/**
 * 肉串订单
 */
public class RouchuanCommand implements Command {

    private Receiver receiver;

    RouchuanCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void order() {
        System.out.println("肉串订单来啦");
        receiver.start();
    }

    @Override
    public void undo() {
        System.out.println("肉串订单取消啦");
        receiver.end();
    }
}

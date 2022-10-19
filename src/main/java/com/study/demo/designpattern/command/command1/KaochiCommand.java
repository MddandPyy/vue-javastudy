package com.study.demo.designpattern.command.command1;

/**
 * 烤翅订单
 */
public class KaochiCommand implements Command {

    private Receiver receiver;

    KaochiCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void order() {
        System.out.println("烤翅订单来啦");
        receiver.start();
    }

    @Override
    public void undo() {
        System.out.println("烤翅订单取消啦");
        receiver.end();
    }
}

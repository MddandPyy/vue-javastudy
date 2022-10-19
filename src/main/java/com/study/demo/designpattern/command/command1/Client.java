package com.study.demo.designpattern.command.command1;

public class Client {
    public static void main(String[] args) {
        //开店前，需要先给厨房师傅分配指令
        Receiver rouchuanReceiver = new RouchuanReceiver();
        Command rouchuanCommand = new RouchuanCommand(rouchuanReceiver);


        Receiver kaochiReceiver = new KaochiReceiver();
        Command kaochiCommand = new KaochiCommand(kaochiReceiver);


        //开始营业点菜
        Waiter waiter = new Waiter();
        waiter.addOrder(rouchuanCommand);
        waiter.addOrder(kaochiCommand);

        waiter.sendOrder();

        waiter.cancelOrder(kaochiCommand);

    }
}

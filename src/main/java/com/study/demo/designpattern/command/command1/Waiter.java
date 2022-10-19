package com.study.demo.designpattern.command.command1;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> list = new ArrayList<>();

    public void addOrder(Command command){
        list.add(command);
    }

    public void cancelOrder(Command command){
        command.undo();
        list.remove(command);
    }

    public void sendOrder(){
        for (Command command:list) {
            command.order();
        }
    }
}

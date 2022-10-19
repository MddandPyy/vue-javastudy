package com.study.demo.designpattern.command.command1;

/**
 * 类比订单
 */
public interface Command {
    //下单
    void order();
    //取消
    void undo();
}

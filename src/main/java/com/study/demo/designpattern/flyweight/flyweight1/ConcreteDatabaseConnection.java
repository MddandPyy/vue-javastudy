package com.study.demo.designpattern.flyweight.flyweight1;

public class ConcreteDatabaseConnection implements DatabaseConnection {
    private String type;

    ConcreteDatabaseConnection(String type){
        this.type = type;
    }


    @Override
    public void exec(Sql sql) {
        System.out.println("数据库:" + type + " ，正在执行sql:" + sql.getValue());
    }
}

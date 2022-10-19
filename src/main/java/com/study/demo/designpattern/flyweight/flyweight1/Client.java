package com.study.demo.designpattern.flyweight.flyweight1;

public class Client {
    public static void main(String[] args) {
        DatabaseConnectionFactory factory = new DatabaseConnectionFactory();
        ConcreteDatabaseConnection mysql = factory.getDatabaseConnectionCategory("数据库A");
        Sql sql = new Sql("select * from test ");
        mysql.exec(sql);
        Sql sql1 = new Sql("insert into test ");
        mysql.exec(sql1);

        ConcreteDatabaseConnection oracle = factory.getDatabaseConnectionCategory("数据库B");
        oracle.exec(sql);
        oracle.exec(sql1);


    }
}

package com.study.demo.designpattern.flyweight.flyweight1;


import java.util.HashMap;

public class DatabaseConnectionFactory {
    //集合， 充当池的作用
    private HashMap<String, ConcreteDatabaseConnection> pool = new HashMap<>();

    //根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中,并返回
    public ConcreteDatabaseConnection getDatabaseConnectionCategory(String type) {
        if(!pool.containsKey(type)) {
            //就创建一个网站，并放入到池中
            pool.put(type, new ConcreteDatabaseConnection(type));
        }

        return (ConcreteDatabaseConnection)pool.get(type);
    }
}

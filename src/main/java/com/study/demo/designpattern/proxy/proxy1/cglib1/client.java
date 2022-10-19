package com.study.demo.designpattern.proxy.proxy1.cglib1;

import com.study.demo.designpattern.proxy.proxy1.dynamic1.JDKTest;

public class client {
    public static void main(String[] args) {
        JDKTest test = (JDKTest) new CglibDynamicProxy().getProxyInstance();
        test.testJDKDynamic();
    }
}

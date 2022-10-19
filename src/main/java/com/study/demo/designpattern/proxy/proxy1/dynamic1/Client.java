package com.study.demo.designpattern.proxy.proxy1.dynamic1;

import com.study.demo.designpattern.proxy.proxy1.staticproxy1.Teacher;

public class Client {
    public static void main(String[] args) {
        Teacher teacherproxy = (Teacher) new LTeacherDynamicProxy().getProxyObject();
        teacherproxy.teach();
        //JDKTest object = (JDKTest)new LTeacherDynamicProxy().getProxyObject();
        //object.testJDKDynamic();

    }
}

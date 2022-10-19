package com.study.demo.designpattern.proxy.proxy1.staticproxy1;

public class client {
    public static void main(String[] args) {

        //刘老师直接授课
        Teacher teacher1 = new LTeacher();
        teacher1.teach();
        //刘老师生病了，居家无法到校。学校买了个代理机器人，刘老师可以在家授课，并通过机器人发出声音。
        //机器人可以对刘老师的声音进行强化加工，使得因为感冒而沙哑的声音，变得正常。
        // 同学对这一转接过程不感知。
        //代理机器人中的刘老师对象，不是在客户端创建，并传入的，如果是就和装饰模式一样了。刘老师对象的创建，是由系统创建，对客户端透明
        Teacher teacherProxy = new LTeacherProxy();
        teacherProxy.teach();
    }
}

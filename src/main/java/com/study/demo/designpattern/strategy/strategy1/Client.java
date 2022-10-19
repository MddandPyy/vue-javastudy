package com.study.demo.designpattern.strategy.strategy1;

public class Client {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        Person person = null;
//        String name = "xiaohong";
//        if("xiaohong".equals(name)){
//            person = new XiaoHong();
//        }else if("xiaoming".equals(name)){
//            person = new XiaoMing();
//        }
//        person.showName();
//        person.chi();
//        person.Chuan();


        PersonFactory factory = new PersonFactory();
        Person person = factory.getPerson("com.study.demo.designpattern.strategy.strategy1.XiaoHong");
        person.showName();
        person.chi();
        person.Chuan();

        Person xiaoming = factory.getPerson1("xiaoming");
        xiaoming.showName();
        xiaoming.chi();
        xiaoming.Chuan();

//        if(小红){
//            System.out.println("我是小红");
//            System.out.println("我爱吃面条");
//            System.out.println("我爱穿红衣服");
//        }else if(小明){
//            System.out.println("我是小明");
//            System.out.println("我爱吃馒头");
//            System.out.println("我爱穿蓝衣服");
//        }else if(小东){
//            System.out.println("我是小东");
//            System.out.println("我爱吃面条");
//            System.out.println("我爱穿蓝衣服");
//        }



//        Person xiaoHong = new XiaoHong();
//        xiaoHong.showName();
//        xiaoHong.chi();
//        xiaoHong.Chuan();
//
//        System.out.println("-------------");
//
//        Person xiaoMing = new XiaoMing();
//        xiaoMing.showName();
//        xiaoMing.chi();
//        xiaoMing.Chuan();
//        xiaoMing.setChiStrategy(new Mian());
//        xiaoMing.chi();
    }
}

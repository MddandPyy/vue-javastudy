package com.study.demo.designpattern.principle.inversion.improve;

public class DependecyInversion {

	public static void main(String[] args) {
		//客户端无需改变
		Person person = new Person();
		person.receive(new Email());

		person.receive(new WeiXin());

		Person1 person1 = new Person1(new Email());
		person1.receive();

		Person2 person2 = new Person2();
		person2.setReceiver(new WeiXin());
		person2.receive();
	}

}

//定义接口
interface IReceiver {
	public String getInfo();
}

class Email implements IReceiver {
	public String getInfo() {
		return "电子邮件信息: hello,world";
	}
}

//增加微信
class WeiXin implements IReceiver {
	public String getInfo() {
		return "微信信息: hello,ok";
	}
}

//方式1方法入参
class Person {
	//这里我们是对接口的依赖
	public void receive(IReceiver receiver ) {
		System.out.println(receiver.getInfo());
	}
}

//方式2构造方法
class Person1 {
	private IReceiver receiver;

	Person1(IReceiver receiver){
		this.receiver = receiver;
	}

	//这里我们是对接口的依赖
	public void receive() {
		System.out.println(receiver.getInfo());
	}
}

//方式3set方法
class Person2 {
	private IReceiver receiver;

	public void setReceiver(IReceiver receiver){
		this.receiver = receiver;
	}

	//这里我们是对接口的依赖
	public void receive() {
		System.out.println(receiver.getInfo());
	}
}


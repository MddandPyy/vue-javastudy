package com.study.demo.designpattern.adapter.interfaceadapter;

import com.study.demo.designpattern.factory.absfactory.pizzastore.order.AbsFactory;

public class Client {
	public static void main(String[] args) {
		
		AbsAdapter absAdapter = new AbsAdapter() {
			//只需要去覆盖我们 需要使用 接口方法
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("使用了m1的方法");
			}

			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("使用了m2的方法");
			}

			@Override
			public void m3() {
				// TODO Auto-generated method stub
				System.out.println("使用了m3的方法");
			}
		};

		absAdapter.m1();
		absAdapter.m2();
		absAdapter.m3();
	}
}


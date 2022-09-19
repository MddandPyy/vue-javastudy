package com.study.demo.designpattern.factory.absfactory.pizzastore.order;


import com.study.demo.designpattern.factory.absfactory.pizzastore.pizza.Pizza;

//һ�����󹤳�ģʽ�ĳ����(�ӿ�)
public interface AbsFactory {
	//������Ĺ��������� ����ʵ��
	public Pizza createPizza(String orderType);

	public Boolean match(String txcode);
}

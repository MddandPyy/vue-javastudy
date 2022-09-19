package com.study.demo.designpattern.factory.absfactory.pizzastore.order;


import java.util.ArrayList;
import java.util.List;

public class OrderPizza {

	private List<AbsFactory> factorys = new ArrayList<>();

	//正常一般都是spring注入，此处模拟类实例化的时候会将所有工厂类型导入
	OrderPizza(){
		AbsFactory factory1 = new BJFactory();
		factorys.add(factory1);
		AbsFactory factory2 = new LDFactory();
		factorys.add(factory2);
	}

	public AbsFactory getFactory(String txcode){
		for (AbsFactory factory:factorys) {
			if(factory.match(txcode)){
				return factory;
			}
		}
		return null;
	}


}

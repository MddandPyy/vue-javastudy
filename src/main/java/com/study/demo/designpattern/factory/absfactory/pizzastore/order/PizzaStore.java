package com.study.demo.designpattern.factory.absfactory.pizzastore.order;

import com.study.demo.designpattern.factory.absfactory.pizzastore.pizza.Pizza;

public class PizzaStore {

	public static void main(String[] args) {
		OrderPizza orderPizza = new OrderPizza();
		AbsFactory factory = orderPizza.getFactory("BJ");
		Pizza cheese = factory.createPizza("cheese");
		cheese.prepare();

	}

}

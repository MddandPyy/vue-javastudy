package com.study.demo.designpattern.visitor;

public abstract class Action {
	
	//�õ����� �Ĳ���
	public abstract void getManResult(Man man);
	
	//�õ�Ů�� ����
	public abstract void getWomanResult(Woman woman);
}
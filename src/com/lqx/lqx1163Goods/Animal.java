package com.lqx.lqx1163Goods;

public class Animal {
	protected String name;
	protected int Age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		Age = age;
	}
	void call(){
		System.out.println("�������");
	}
	protected void movement() {
		System.out.println("���"+ this.name + "����һ��");
	}
}
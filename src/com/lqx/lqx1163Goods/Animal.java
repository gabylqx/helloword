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
		System.out.println("动物叫了");
	}
	protected void movement() {
		System.out.println("这个"+ this.name + "跑了一会");
	}
}
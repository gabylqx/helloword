package com.lqx.Lqx1172Contructor;

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
	void call3(){
		System.out.println("动物叫了");
	}
	protected void movement() {
		System.out.println("这个"+ this.name + "跑了一会");
	}
	
	
	public Animal(String name, int age) {
		this.name = name;
		Age = age;
	}
	public Animal(String name) {
		this.name = name;
	}
	public Animal() {
		this("默认猫",15);
	}
	
	
}

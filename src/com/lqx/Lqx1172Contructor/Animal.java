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
		System.out.println("�������");
	}
	void call3(){
		System.out.println("�������");
	}
	protected void movement() {
		System.out.println("���"+ this.name + "����һ��");
	}
	
	
	public Animal(String name, int age) {
		this.name = name;
		Age = age;
	}
	public Animal(String name) {
		this.name = name;
	}
	public Animal() {
		this("Ĭ��è",15);
	}
	
	
}

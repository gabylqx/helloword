package com.lqx.Lqx1172Contructor;

public class Cat extends Animal {
	private char gender;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "Cat [gender=" + gender + ", name=" + name + ", Age=" + Age + "]";
	}

	void call() {
		System.out.println("��� "+ this.name + "�� ����һ��");
	}
	
	void call1() {
		System.out.println("��� "+ this.name + "�� ����һ��");
	}
	
	public Cat(){
		super();
		this.gender = '��';
	}
}

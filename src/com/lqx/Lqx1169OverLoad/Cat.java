package com.lqx.Lqx1169OverLoad;

public class Cat extends Animal {
	private char gender;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	void call() {
		System.out.println("��� "+ this.name + "è	 ����һ��");
	}
	void ccaca() {
		System.out.println("è��ë��");
	}
}

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
		System.out.println("这个 "+ this.name + "猫	 叫了一天");
	}
	void ccaca() {
		System.out.println("猫有毛病");
	}
}

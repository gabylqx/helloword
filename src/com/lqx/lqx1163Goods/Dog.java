package com.lqx.lqx1163Goods;

public class Dog extends Animal {
	private char gender;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	void call() {
		System.out.println("这个 "+ this.name + "狗 叫了一天");
	}
}

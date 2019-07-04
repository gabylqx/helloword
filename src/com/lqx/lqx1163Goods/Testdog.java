package com.lqx.lqx1163Goods;

public class Testdog {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("Ð¡ºÚ");
		d1.setAge(25);
		d1.setGender('Ä¸');
		d1.call();
		d1.movement();
		Animal a = new Dog();
		
		Animal a1 = new Animal();
		
		a.setName("ÁõÏè");
		a1.setName("½áÂÛ");
		a1.call();
		a.call();
	}
}
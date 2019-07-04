package com.lqx.Lqx1172Contructor;

public class test {
	public static void main(String[] args) {
		Goods g1 = new Goods();
		Goods g2 = new Goods(4);
		Goods g3 = new Goods(2,"sss");
		Goods g4 = new Goods(867,"djkeshefil",45);
		
		Cust c1 = new Cust(1);
		Cust c2 = new Cust("ss");
		Cust c3 = new Cust();
		Animal c5 = new Cat();
		Animal c6 = new Animal();
		
		Cat c4  = new Cat();
		System.out.println(c4.toString());
		c4.movement();
		c4.call();
		c5.call();
	}
}

package com.lqx.thread;

public class Lqx1275_1 {
	public static void main(String[] args) throws Exception {
		Lqx1275_2 car = new Lqx1275_2();
		Lqx1275_3 production = new Lqx1275_3(car);
		Lqx1275_4 hand = new Lqx1275_4(car);
		new Thread(hand).start();
		new Thread(production).start();
	}
}
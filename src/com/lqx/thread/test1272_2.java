package com.lqx.thread;

public class test1272_2 {
	public static void main(String[] args) throws Exception {
		Lqx1272_2 t = new Lqx1272_2();
		Thread t1 = new Thread(t,"¿Ò»√1");
		Thread t2 = new Thread(t,"≤ª¿Ò»√2");
		t1.start();
		t2.start();
	}
}

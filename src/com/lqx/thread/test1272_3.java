package com.lqx.thread;

public class test1272_3 {
	public static void main(String[] args) throws Exception {
		Lqx1272_3 t = new Lqx1272_3();
		Thread t1 = new Thread(t,"С1");
		Thread t2 = new Thread(t,"С2");
		t1.start();
		t2.start();
	}
}

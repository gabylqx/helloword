package com.lqx.thread;

public class test1272_1 {
	public static void main(String[] args) throws Exception {
		Lqx1272_1 t = new Lqx1272_1();
		Thread t1 = new Thread(t,"优先级02");
		Thread t2 = new Thread(t,"优先级04");
		Thread t3 = new Thread(t,"优先级06");
		Thread t4 = new Thread(t,"优先级08");
		Thread t5 = new Thread(t,"优先级10");
		t1.setPriority(2);
		t2.setPriority(4);
		t3.setPriority(6);
		t4.setPriority(8);
		t5.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}

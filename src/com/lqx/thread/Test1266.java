package com.lqx.thread;

public class Test1266 {
	public static void main(String[] args) {
		Lqx1266 th = new Lqx1266();
		Thread t1 = new Thread(th,"����Ա1");
		Thread t2 = new Thread(th,"����Ա2");
		Thread t3 = new Thread(th,"����Ա3");
		t1.start();
		t2.start();
		t3.start();
	}
}

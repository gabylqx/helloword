package com.lqx.thread;

public class test1269 {
	public static void main(String[] args) throws Exception {
		Lqx1269_1 t = new Lqx1269_1();
		Thread t1 = new Thread(t,"¿Ó∆‰ËØ");
		t1.start();

		for (int i = 0; i < 20; i++) {
			Thread.sleep(10);
			if(i>6) {
				t1.join();
			}
			System.out.print(Thread.currentThread().getName()+" ");
		}
	}
}

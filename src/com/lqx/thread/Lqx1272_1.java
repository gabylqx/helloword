package com.lqx.thread;

public class Lqx1272_1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"����"+(i+1));
		}
	}
}
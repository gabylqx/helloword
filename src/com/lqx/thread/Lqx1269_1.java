package com.lqx.thread;

public class Lqx1269_1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"´ÎÊý"+(i+1));
		}
	}
}
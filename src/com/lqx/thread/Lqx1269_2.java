package com.lqx.thread;

public class Lqx1269_2 extends Thread {
	@Override
	public void run() {
		try {
			int i = 0;
			while (true) {
				Thread.sleep(50);
				System.out.println(Thread.currentThread().getName() + "次数" + i++);
			}
		} catch (Exception e) {
			System.out.println("线程中断");
			return;
		}
	}
}
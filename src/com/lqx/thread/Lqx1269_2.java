package com.lqx.thread;

public class Lqx1269_2 extends Thread {
	@Override
	public void run() {
		try {
			int i = 0;
			while (true) {
				Thread.sleep(50);
				System.out.println(Thread.currentThread().getName() + "����" + i++);
			}
		} catch (Exception e) {
			System.out.println("�߳��ж�");
			return;
		}
	}
}
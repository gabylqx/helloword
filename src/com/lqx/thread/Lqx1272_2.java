package com.lqx.thread;

import java.util.Date;

public class Lqx1272_2 extends Thread {
	@Override
	public void run() {
		Date d = new Date();
		for (int i = 0; i < 12; i++) {

			System.out.print(Thread.currentThread().getName() + "����" + (i + 1));
			if ("����1".equals(Thread.currentThread().getName()) || "����2".equals(Thread.currentThread().getName())){
				Thread.currentThread().yield();
			}
		}
		Date o = new Date();
		System.out.println();
		System.out.println(Thread.currentThread().getName() + "�߳�ִ��ʱ��Ϊ��" + (o.getTime() - d.getTime()) + "ms");

	}
}
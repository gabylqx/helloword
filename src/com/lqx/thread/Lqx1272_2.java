package com.lqx.thread;

import java.util.Date;

public class Lqx1272_2 extends Thread {
	@Override
	public void run() {
		Date d = new Date();
		for (int i = 0; i < 12; i++) {

			System.out.print(Thread.currentThread().getName() + "次数" + (i + 1));
			if ("礼让1".equals(Thread.currentThread().getName()) || "礼让2".equals(Thread.currentThread().getName())){
				Thread.currentThread().yield();
			}
		}
		Date o = new Date();
		System.out.println();
		System.out.println(Thread.currentThread().getName() + "线程执行时间为：" + (o.getTime() - d.getTime()) + "ms");

	}
}
package com.lqx.thread;

public class Lqx1263_1 extends Thread {
//	定义继承 Thread 的类
//	改写类的 run 方法，要求每 150 毫秒打印一次线程名
//	在 main 中 3 次实例化这个类，并调用,同时注意显示的
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"ci's"+i);
		}
	}
	
}

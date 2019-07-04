package com.lqx.thread;

public class Lqx1263_2 implements Runnable {
//	定义实现 Runnable 接口的类
//	此类的 run 方法，要求每 50 毫秒打印一次线程名
//	在 main 中 3 次实例化这个类，并调用
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}

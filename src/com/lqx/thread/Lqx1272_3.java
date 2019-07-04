package com.lqx.thread;

public class Lqx1272_3 extends Thread {
	Object bowl = new Object();
	Object spoon = new Object();

	@Override
	public void run() {
		try {
			if ("小1".equals(Thread.currentThread().getName())) {
				synchronized (bowl) {
					System.out.println("小一拿到了碗，没勺子，去抢");
					Thread.sleep(300);
					synchronized (spoon) {
						System.out.println("碗勺子都有，小一吃！");
					}
				}
			} else if ("小2".equals(Thread.currentThread().getName())) {
				synchronized (spoon) {
					System.out.println("小二拿到了勺，没碗，去抢");
					Thread.sleep(300);
					synchronized (bowl) {
						System.out.println("碗勺子都有，小二吃！");
					}
				}
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
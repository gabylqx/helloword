package com.lqx.thread;

public class Lqx1266 implements Runnable {
	public int advert = 50;

	public void run() {
		int ad = 0;
		while(ad!=200) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ad = advertising(ad);
			
		}
	}

	synchronized public int advertising(int ad) {
		if (advert > 0) {
			
			System.out.println(Thread.currentThread().getName() + "发出了：" + advert-- 
					+ "号传单，目前剩余传单数量为：" + advert);
			return ++ad;
		} else {
			System.out.println(Thread.currentThread().getName() + "发传单结束，总计发放数量：" + ad);
			return 200;
		}
	}
}
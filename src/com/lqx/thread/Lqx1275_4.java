package com.lqx.thread;

public class Lqx1275_4 implements Runnable {
	private Lqx1275_2 car = null;

	public Lqx1275_4(Lqx1275_2 car) {
		this.car = car;
	}

	@Override
	public void run() {
		for (int i = 1; i < 101; i++) {
			try {
				Thread.sleep(10);
				this.car.get();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
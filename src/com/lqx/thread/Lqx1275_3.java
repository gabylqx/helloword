package com.lqx.thread;

public class Lqx1275_3 implements Runnable {
	private Lqx1275_2 car = null;

	public Lqx1275_3(Lqx1275_2 car) {
		this.car = car;
	}

	@Override
	public void run() {
		for (int i = 1; i < 101; i++) {
			try {
				this.car.set(i, "µÚ" + i + "Á¾Ð¡Æû³µ");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
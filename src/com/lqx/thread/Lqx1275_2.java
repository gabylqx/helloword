package com.lqx.thread;
public class Lqx1275_2 {
	private int id;
	private String name;
	boolean bl = true;

	synchronized public void set(int id, String name) throws Exception {
		if (!bl) {
			super.wait();
		}
		this.id = id;
		Thread.sleep(10);
		this.name = name;
		System.out.println(this.name+"�Ѿ�������������ţ�"+this.id);
		bl=false;
		super.notify();
	}

	public synchronized void get() {
		try {
			if (bl) {
				super.wait();
			}
			Thread.sleep(300);
			System.out.println(this.name + "�Ѿ������ߣ���������ǣ�" + this.name);
			bl = true;
			super.notify();

		} catch (Exception e) {

		}
	}
}
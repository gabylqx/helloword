package com.lqx.thread;

public class Lqx1272_3 extends Thread {
	Object bowl = new Object();
	Object spoon = new Object();

	@Override
	public void run() {
		try {
			if ("С1".equals(Thread.currentThread().getName())) {
				synchronized (bowl) {
					System.out.println("Сһ�õ����룬û���ӣ�ȥ��");
					Thread.sleep(300);
					synchronized (spoon) {
						System.out.println("�����Ӷ��У�Сһ�ԣ�");
					}
				}
			} else if ("С2".equals(Thread.currentThread().getName())) {
				synchronized (spoon) {
					System.out.println("С���õ����ף�û�룬ȥ��");
					Thread.sleep(300);
					synchronized (bowl) {
						System.out.println("�����Ӷ��У�С���ԣ�");
					}
				}
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
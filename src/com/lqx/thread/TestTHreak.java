package com.lqx.thread;

import java.util.Random;

public class TestTHreak {
	public static void main(String[] args) {
//		�� main ��ʹ�������෽ʽʵ�� Runnable �ӿڵ��࣬Ҫ��ÿ 120 �����ӡһ���߳���
//		Ȼ����ִ����һ�������࣬Ҫ��ÿ 100 ����, ��ӡһ���������
		Thread threadnoclass = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 30; i++) {
					try {
						Thread.sleep(120);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
				}
			}
		}, "����1");
		threadnoclass.start();
		
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 30; i++) {
					try {
						Thread.sleep(120);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Random random = new Random();
					System.out.print(Thread.currentThread().getName());
					System.out.println(",�����������"+random.nextInt(100));
				}
			}
		}, "����2").start();

//		Lqx1263_1 th1 = new Lqx1263_1();
//		Lqx1263_1 th2 = new Lqx1263_1();
//		Lqx1263_1 th3 = new Lqx1263_1();
//		th1.start();
//		th2.start();
//		th3.start();
//		
//		Lqx1263_2 th1 = new Lqx1263_2();
//		Lqx1263_2 th2 = new Lqx1263_2();
//		Lqx1263_2 th3 = new Lqx1263_2();
//		Thread t1 = new Thread(th1);
//		Thread t2 = new Thread(th2);
//		Thread t3 = new Thread(th3);
// 		t1.setName("�߳�1");
//		t2.setName("�߳�2");
//		t3.setName("�߳�3");
//		t1.start();
//		t2.start();
//		t3.start();

	}
}

package com.lqx.thread;

public class Lqx1263_2 implements Runnable {
//	����ʵ�� Runnable �ӿڵ���
//	����� run ������Ҫ��ÿ 50 �����ӡһ���߳���
//	�� main �� 3 ��ʵ��������࣬������
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

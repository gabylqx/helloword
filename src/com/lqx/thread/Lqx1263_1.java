package com.lqx.thread;

public class Lqx1263_1 extends Thread {
//	����̳� Thread ����
//	��д��� run ������Ҫ��ÿ 150 �����ӡһ���߳���
//	�� main �� 3 ��ʵ��������࣬������,ͬʱע����ʾ��
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

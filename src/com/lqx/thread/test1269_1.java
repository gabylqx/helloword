package com.lqx.thread;

public class test1269_1 {
	public static void main(String[] args) throws Exception {
		Lqx1269_2 t = new Lqx1269_2();
		Thread t2 = new Thread(t,"�����");
		t2.start();//ʼ

		Thread.sleep(1000);//Ъ
		
		t2.interrupt();//��
	}
}

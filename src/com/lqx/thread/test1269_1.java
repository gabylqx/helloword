package com.lqx.thread;

public class test1269_1 {
	public static void main(String[] args) throws Exception {
		Lqx1269_2 t = new Lqx1269_2();
		Thread t2 = new Thread(t,"ÀîÆäè¯");
		t2.start();//Ê¼

		Thread.sleep(1000);//Ğª
		
		t2.interrupt();//ÖÕ
	}
}

package com.lqx.Lqx1169OverLoad;

public class TestAr {
	public static void main(String[] args) {
//		�������У�ʵ��������cat����������ķ���ccaca���ٵ��ø��������Name���ұ���д����call	
		Cat c1 = new Cat();
		c1.ccaca();
		c1.setName("ɵ");
		c1.call();
		
//		ʹ���������췽����ʵ������������
		EatJ a = new EatJ();
		EatJ b = new EatJ(12);
		EatJ c = new EatJ(151,4);
	}
}

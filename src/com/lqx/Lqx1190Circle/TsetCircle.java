package com.lqx.Lqx1190Circle;

public class TsetCircle {
	public static void main(String[] args) {
		Circle c = new Circle(456.5);
		System.out.println(c);
		
//		new ���� String,����һ����ʹ��==�� equals ���бȽ�
		String s1 = new String("ab");
		String s2 = new String("ab");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
//		�� int Ϊ����дװ��Ͳ���
		//װ��
		Integer i1  = 56; 
		//����
		int i2 = i1;
		int i3 = new Integer(56) ;
		
//		�� double Ϊ����дװ��Ͳ���
		//װ��
		Double d1  = 56.5; 
		//����
		double d2 = d1;
		double d3 = new Double(56.5) ;
		
//		�� boolean Ϊ����дװ���
		//װ��
		Boolean b1  = false; 
		//����
		boolean b2 = b1;
		boolean b3 = new Boolean(false) ;
	}
}

package com.lqx;

import java.util.Date;

public class Lqx1193String2 {
	public static void main(String[] args) {
//		д���룬�ѡ�123��ת��������
		int i = Integer.parseInt("123");
//		д���룬�ѡ�53.21����ת���ɸ�����
		float f = Float.parseFloat("53.21");
//		�ѡ�true��ת���� boolean
		boolean b = Boolean.parseBoolean("true");
//		�ѡ�12��ת���� byte
		byte by = Byte.parseByte("12");
//		�ѡ�5.123��ת���� double
		double dou = Double.parseDouble("5.123");
//		�ѡ�i am a student��ת�����ַ�����
		String[] str = "i am a student".split(" ");
		for(String ss:str) {
			System.out.println(ss);
		}
//		�� 2015-12-08 11:02:23 ��ʽ�������ǰʱ��
		Date d = new Date();
		System.out.println(d);
		System.out.println(String.format("%tY-%tm-%td %tT",d,d,d,d));
//		�� 2015-ʮ����-08 ��ʽ�������
		System.out.println(String.format("%tY-%tB-%td",d,d,d));
	}
}

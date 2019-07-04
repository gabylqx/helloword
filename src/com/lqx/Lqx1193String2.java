package com.lqx;

import java.util.Date;

public class Lqx1193String2 {
	public static void main(String[] args) {
//		写代码，把“123”转换成整数
		int i = Integer.parseInt("123");
//		写代码，把”53.21”，转换成浮点数
		float f = Float.parseFloat("53.21");
//		把”true”转换成 boolean
		boolean b = Boolean.parseBoolean("true");
//		把”12”转换成 byte
		byte by = Byte.parseByte("12");
//		把”5.123”转换成 double
		double dou = Double.parseDouble("5.123");
//		把”i am a student”转换成字符数组
		String[] str = "i am a student".split(" ");
		for(String ss:str) {
			System.out.println(ss);
		}
//		以 2015-12-08 11:02:23 格式，输出当前时间
		Date d = new Date();
		System.out.println(d);
		System.out.println(String.format("%tY-%tm-%td %tT",d,d,d,d));
//		以 2015-十二月-08 格式输出当天
		System.out.println(String.format("%tY-%tB-%td",d,d,d));
	}
}

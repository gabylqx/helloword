package com.lqx.Lqx1190Circle;

public class TsetCircle {
	public static void main(String[] args) {
		Circle c = new Circle(456.5);
		System.out.println(c);
		
//		new 二个 String,内容一样，使用==和 equals 进行比较
		String s1 = new String("ab");
		String s2 = new String("ab");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
//		以 int 为例，写装箱和拆箱
		//装箱
		Integer i1  = 56; 
		//拆箱
		int i2 = i1;
		int i3 = new Integer(56) ;
		
//		以 double 为例，写装箱和拆箱
		//装箱
		Double d1  = 56.5; 
		//拆箱
		double d2 = d1;
		double d3 = new Double(56.5) ;
		
//		以 boolean 为例，写装箱和
		//装箱
		Boolean b1  = false; 
		//拆箱
		boolean b2 = b1;
		boolean b3 = new Boolean(false) ;
	}
}

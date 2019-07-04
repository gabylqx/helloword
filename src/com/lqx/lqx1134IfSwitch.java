package com.lqx;

public class lqx1134IfSwitch {
	public static void main(String[] args) {
//		1. 初始化 2 个整数 x, y,并初始化 
		int x = 10;
		int y = 5;
//		如果 x 大于 y,输出 x 的具体的值大于 y 的具体的值
		if(x>y) {
			System.out.println(x-y);
		}
//		如 x=10, y=5,则输出的内容是 10>5
		if(x==10&&y==5) {
			System.out.println("10>5");
		}
//		重新设置 x,y 的值
		x = 5;
		y = 25;
//		如果 x 大于 y,输出 x 具体的值大于 y 具体的值
		if(x>y) {
			System.out.println(x-y);
		}
//		否则,输出 x 具体的值小于等于 y 具体的值
		else {
			System.out.println(y-x);
		}
//		2. 定义 2 个字符串变量 str1、str2,
		String str1,str2;
//		给这二个变量附初值对它们进行比较(使用 if-else if-else)
//		根据比较的内容，写出字符串的比较值大于 0、等于 0 或小于 0	
		str1="得到";
		str2="得不到";
		if(str1.length()>str2.length()) {
			System.out.println("str1比str2长："+(str1.length()-str2.length()));
		}
		else if(str1.length()<str2.length()) {
			System.out.println("str1比str2短："+(str2.length()-str1.length()));
		}
		else {
			System.out.println("一样长——————");
		}
//		3. 使用 switch 语句改写下列 if 语
		int a = 3;
		int b = 100;
		switch(a) {
		case 1:
			b+=5;
			break;
		case 2:
			b+=10;
			break;
		case 3:
			b+=16;
			break;
		default:
			b += 100;
			break;
		}
		System.out.println(b);
	}
}

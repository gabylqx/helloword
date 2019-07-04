package com.lqx;

public class lqx1140Identify {
	public static void main(String[] args) {
//		定义 1 字节整数变量，纯字符变量名，不带初始化值，然后再赋最大值，再赋最小值
		byte x;
		x = 127;
		System.out.println("byte最大值：" + x);
		x = -128;
		System.out.println("byte最小值：" + x);
//		定义 2 字节整数变量，变量名带数字，带初始化值
		short x1 = 32767;
		System.out.println("short型变量x1值为：" + x1);
//		定义 4 字节整数变量，变量名以$打头，不带初
		int $x;
//		定义 8 字节整数变量，变量名以下划线打头
		long _x;
//		定义 4 字节浮点数变量(一个带字母，数字，$，下划线)，不带初始化值，然后再给它赋值
		float x3$_;
//		定义 8 字节浮点数变量，带初始化值, 再重新赋值
		x3$_ = 0.5f;
		double dx = 0.56;
		dx = 0.65;
		boolean bool = true;
		bool = false;
		dx = 0.1 + 0.2;
		char a = '\\';
		System.out.println(dx);
		System.out.print(a);
	}

}
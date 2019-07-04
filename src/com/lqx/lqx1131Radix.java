package com.lqx;

public class lqx1131Radix {
	public static void main(String[] args) {
//		1. 定义 4 个整数型变量，分别用 4 种不同的进制方式分别初始化
		int i2 = 0b1111011;
		int i8 = 0756;
		int i10 = 956;
		int i16 = 0xa2;
//		分别输出变量的值
		System.out.println(i2);
		System.out.println(i8);
		System.out.println(i10);
		System.out.println(i16);
//		2. 定义一个整数型变量以 4 种进制的方式，输出这个变量的内容
		int ii=456;
		System.out.println("ii=456，2进制输出为："+Integer.toBinaryString(ii));
		System.out.println("ii=456，8进制输出为："+Integer.toOctalString(ii));
		System.out.println("ii=456，10进制输出为："+ii);
		System.out.println("ii=456，16进制输出为："+Integer.toHexString(ii));
//		3. 分别定义一个整数型变量，赋初值
		int iii=4;
//		使用位运算符，完成此变量乘 16 的运算
		System.out.println(iii<<4);
//		使用位运算符，完成此变量除以 4 的运算
		System.out.println(iii>>2);
//		使此变量无符号右移 2 位
		iii>>>=2;
		System.out.println(iii);
//		4. 输出 10 与 35 的位与的值
		System.out.println(10&35);
//		5. 输出 38 与 11 的位或的值
		System.out.println(38|11);
//		6. 输出 40 与 30 的 位异或的值
		System.out.println(40^30);
//		7. 输出 22 的反码的值,要会手工
		System.out.println(~22);
//      0000 0000 0000 0000 0000 0000 0001 0110 原码
//		1111 1111 1111 1111 1111 1111 1110 1001   反码
	}
}

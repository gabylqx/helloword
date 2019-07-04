package com.lqx;

public class Dec {
	public static void main(String[] args) {
//		定义 1 个字符变量，带初始化值
		char ch = 'b';
//		然后以另外二种方式给它赋值输出这个变量的字符值，unicode值
		ch = 45;
		ch = '\u662f';
		System.out.println("ch的字符值：" + ch);
		System.out.println("ch的unicode值：" + (int) ch);
//		把这下变量+1，然后输出字符值
		System.out.println("ch+1的字符值：" + (char) (ch + 1));
//		对于 8 种基本类型，分别定义 1 个变量,分别初始化成不同的
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		char c = 'b';
		float f = 0.5f;
		double d = 0.6;
		boolean bool = true;
//		然后用容量小的变量给容量大变量赋值，把能够自动的全部组合方式，全部写出来，共有 19种，写出 5 种
		i = b;
		i = s;
		d = f;
		l = b;
		l = s;
//		定义一个字符串变量，带初始值
		String str = "abcd";
//		然后把这个字符串与其他 8 种基本数据类型进行+运算，输出结果
		System.out.println(str + b);
		System.out.println(str + s);
		System.out.println(str + i);
		System.out.println(str + l);
		System.out.println(str + c);
		System.out.println(str + f);
		System.out.println(str + d);
		System.out.println(str + bool);
//		然后再赋值为”345”，这个字符串给整数变量赋值
		str = "345";
		i = Integer.parseInt(str);
		System.out.println(i);
//		定义一个 short 整型值，初值为 1000
		short sh = 1000;
//		然后把此 short 变量的值，赋给一个 byte 型变量，打印出这个 byte 内容，感受数据
		b = (byte) sh;
		System.out.println(b);
	}
}

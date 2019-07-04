package com.lqx;

public class lqx1125Cal {
	public static void main(String[] args) {
		/**
		 * 1. 定义二个整数 
		 * 对这二个变更进行加减乘除取余运算 
		 * 对上面二个变量，分别进行前自增和后自增运算 
		 * 对上面二个变量，分别进行前自减和后自减运算
		 */
		int b = 0;
		int c = 0;
		int i = 5;
		int j = 3;
		int x;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);
		System.out.println("<----------------------->");
		System.out.println("i=5:i++为：" + i++ + "，运算后i值为" + i);
		System.out.println("j=3:j++为：" + j++ + "，运算后j值为" + j);
		System.out.println("<------------------------>");
		System.out.println("i=6:++i为：" + ++i + "，运算后i值为" + i);
		System.out.println("j=4:++j为：" + ++j + "，运算后j值为" + j);
		System.out.println("<------------------------>");
		System.out.println("i=7:i--为：" + i-- + "，运算后i值为" + i);
		System.out.println("j=5:j--为：" + j-- + "，运算后j值为" + j);
		System.out.println("<------------------------>");
		System.out.println("i=6:--i为：" + --i + "，运算后i值为" + i);
		System.out.println("j=4:--j为：" + --j + "，运算后j值为" + j);
		System.out.println("<------------------------>");
		// 2. 定义一个浮点数，写一个有加减乘除、取模运算的语句
		float a = 14.4f;
		a=((a+6)-1)/3*3%3;
		System.out.println(a);
		System.out.println("<------------------------>");
		// 3. 写出 a=a+1 的简写语句
		a+=1;
		// 4. 写负数取模的语句,分 4 种情况，输出结果
		System.out.println((-5) % 2);
		System.out.println((-5) % (-2));
		System.out.println(5 % (-2));
		System.out.println(5 % 2);
		System.out.println("<------------------------>");
		// 5. 写一个整数相除赋值给浮点数的语句
		int zs=2,z1=3;
		float fd=2.4f;
		fd=(float)z1/zs;
		System.out.println(fd);
		System.out.println("<------------------------>");
		// 6. 写出 b=b+10、 b=b-5、 a=a*b、 c=c/b、 b=b%a 的简写语句
		b+=10; 
		b-=5;
		a*=b;
		c/=b;
		b%=a;
		// 7. 写出 1 大于 2 的比较结果的语句
		System.out.println(1>2);
		System.out.println("<------------------------>");
		// 8. 写出比较’a’是否大于等于’b’的测试试语句
		System.out.println(a>=b);
		System.out.println("<------------------------>");
		// 9. 写出“abc”是否是字符串类型的测试

		System.out.println( "abc" instanceof String);
		System.out.println("<------------------------>");
	}
}

package com.lqx;

public class lqx1128Logical {
	public static void main(String[] args) {
//		i = 3, j = 6，k =5;
		int i = 3;
		int j = 6;
		int k = 5;
//		输入 i 大于 j 而且 i 大于 k 的结果
		System.out.println((i > j) && (i > k));
		System.out.println("<----------------------->");
//		输出 i 小于 k 或 j 大于 k 的结果
		System.out.println((i < k) || (i > k));
		System.out.println("<----------------------->");
//		写出一条取反的语句
		System.out.println(!(i < k) || (i > k));
		System.out.println("<----------------------->");
//		写出一条有异或的语句
		System.out.println((i < k) ^ (i > k));
		System.out.println("<----------------------->");
//		使用++语句，写出识别&，与&&区别的语句
		int a = 1;
		System.out.println(1 > 2 && ++a > 1);
		System.out.println(a);
		System.out.println(1 > 2 & ++a > 1);
		System.out.println(a);
		System.out.println("<----------------------->");
//		写出识别 | 与 ||区别的语句
		int b = 1;
		System.out.println(2 > 1 || ++b > 1);
		System.out.println(b);
		System.out.println(1 < 2 | ++b > 1);
		System.out.println(b);
		System.out.println("<----------------------->");
//		用三元运算完成二个数取最小值的功能
		int c=3,d=2;
		System.out.println((c<d)?c:d );
		System.out.println("<----------------------->");
//		用三元运算符完成 3 个数取最大值的
		int e=33,f=12,z=55;
		System.out.println((((e>f)?e:f)>z)?((e>f)?e:f):z );
		System.out.println(true | true & false);
	}
}

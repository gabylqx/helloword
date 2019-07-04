package com.lqx.Lqx1166Tel;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		int a = 2;
		Mobile a1 = new Mobile();
		int[] as = {0,5,7};
		String str = "emmmm.....";
		
		//int
		f(a);
		System.out.println(a);
		s();
		
		//类引用
		a1.a=2;
		fd(a1);
		System.out.println(a1.a);
		s();
		
		//数组
		fs(as);
		System.out.println(Arrays.toString(as));
		s();
		
		//字符串
		fstr(str);
		System.out.println(str);
		s();
		
	}
	private static void s() {
		System.out.println("----------------------------");
	}
	public static void f(int a) {
		a+=25;
	}
	
	public static void fd(Mobile a) {
		a.a=58;
	}
	public static void fs(int a[]) {
		a[0]=58;
	}
	public static void fstr(String a) {
		a+="已经修改";
	}
}

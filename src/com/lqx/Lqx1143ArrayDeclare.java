package com.lqx;

public class Lqx1143ArrayDeclare {
	public static void main(String[] args) {
//		用二种方法定义下列所列数据类型的数组，并创建数组对象
//		1. 整数，长度是 10
		int[] is = new int[10];
		int[] is1 = { 1, 5, 5, 5, 4, 5, 6, 4, 5, 4 };
//		2. 字符，长度是 1024
		char[] cs = new char[1024];
		char[] cs1;
		cs1 = new char[1024];
//		3. 字符串，长度是 5
		String[] strs = new String[5];
		String[] strs2;
		strs2 = new String[5];
//		4. 给整数数组第 5 个元素赋值 200
		is[4] = 200;
		System.out.println(is[4]);
		System.out.println("____________");
//		5. 定义一个 5 个元素的字符串数组，初始成"abc","def","fgh","jkl","zyx"用 foreach 显示数组的内容
		String[] strs1 = new String[] { "abc", "def", "fgh", "jkl", "zyx" };
		for (String i : strs1) {
			System.out.println(i);
		}
		System.out.println("____________");
//		6. 使用静态初始化定义一个 10 元素字符数组
		char[] cs2 = new char[10];
//		7. 使用另一种静态初始化方式定义另一种浮点数数组
		float[] fs = new float[] {};
//		8. 使用动态初始化方式定义一个字节
		byte[] bs;
		bs = new byte[] {};
	}
}

package com.lqx;

public class Lqx1196StringBufferBuilder {
	public static void main(String[] args) {
//		1. 使用三种方式构造 StringBuffer
		StringBuffer s = new StringBuffer();
		StringBuffer s1 = new StringBuffer("abcdefg");
		StringBuffer s2 = new StringBuffer(20);
//		2. 向一个 StringBuffer 后面增加"abcdefg hijklmn"
		s1.append("abcdefg hijklmn");
		System.out.println(s1);
//		3. 替换前面 StringBuffer 中"ijk"为"ab"
		System.out.println(s1.replace(s1.indexOf("ijk"), s1.indexOf("ijk") + 3, "ab"));
//		4. 构造一个 800 字符的 StringBuilder
		StringBuffer s3 = new StringBuffer(800);
		System.out.println(s3.capacity());
	}
}

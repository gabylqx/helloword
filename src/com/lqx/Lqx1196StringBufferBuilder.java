package com.lqx;

public class Lqx1196StringBufferBuilder {
	public static void main(String[] args) {
//		1. ʹ�����ַ�ʽ���� StringBuffer
		StringBuffer s = new StringBuffer();
		StringBuffer s1 = new StringBuffer("abcdefg");
		StringBuffer s2 = new StringBuffer(20);
//		2. ��һ�� StringBuffer ��������"abcdefg hijklmn"
		s1.append("abcdefg hijklmn");
		System.out.println(s1);
//		3. �滻ǰ�� StringBuffer ��"ijk"Ϊ"ab"
		System.out.println(s1.replace(s1.indexOf("ijk"), s1.indexOf("ijk") + 3, "ab"));
//		4. ����һ�� 800 �ַ��� StringBuilder
		StringBuffer s3 = new StringBuffer(800);
		System.out.println(s3.capacity());
	}
}

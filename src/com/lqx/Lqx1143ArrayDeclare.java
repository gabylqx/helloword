package com.lqx;

public class Lqx1143ArrayDeclare {
	public static void main(String[] args) {
//		�ö��ַ����������������������͵����飬�������������
//		1. ������������ 10
		int[] is = new int[10];
		int[] is1 = { 1, 5, 5, 5, 4, 5, 6, 4, 5, 4 };
//		2. �ַ��������� 1024
		char[] cs = new char[1024];
		char[] cs1;
		cs1 = new char[1024];
//		3. �ַ����������� 5
		String[] strs = new String[5];
		String[] strs2;
		strs2 = new String[5];
//		4. ����������� 5 ��Ԫ�ظ�ֵ 200
		is[4] = 200;
		System.out.println(is[4]);
		System.out.println("____________");
//		5. ����һ�� 5 ��Ԫ�ص��ַ������飬��ʼ��"abc","def","fgh","jkl","zyx"�� foreach ��ʾ���������
		String[] strs1 = new String[] { "abc", "def", "fgh", "jkl", "zyx" };
		for (String i : strs1) {
			System.out.println(i);
		}
		System.out.println("____________");
//		6. ʹ�þ�̬��ʼ������һ�� 10 Ԫ���ַ�����
		char[] cs2 = new char[10];
//		7. ʹ����һ�־�̬��ʼ����ʽ������һ�ָ���������
		float[] fs = new float[] {};
//		8. ʹ�ö�̬��ʼ����ʽ����һ���ֽ�
		byte[] bs;
		bs = new byte[] {};
	}
}

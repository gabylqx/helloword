package com.lqx;

public class lqx1140Identify {
	public static void main(String[] args) {
//		���� 1 �ֽ��������������ַ���������������ʼ��ֵ��Ȼ���ٸ����ֵ���ٸ���Сֵ
		byte x;
		x = 127;
		System.out.println("byte���ֵ��" + x);
		x = -128;
		System.out.println("byte��Сֵ��" + x);
//		���� 2 �ֽ����������������������֣�����ʼ��ֵ
		short x1 = 32767;
		System.out.println("short�ͱ���x1ֵΪ��" + x1);
//		���� 4 �ֽ�������������������$��ͷ��������
		int $x;
//		���� 8 �ֽ��������������������»��ߴ�ͷ
		long _x;
//		���� 4 �ֽڸ���������(һ������ĸ�����֣�$���»���)��������ʼ��ֵ��Ȼ���ٸ�����ֵ
		float x3$_;
//		���� 8 �ֽڸ���������������ʼ��ֵ, �����¸�ֵ
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
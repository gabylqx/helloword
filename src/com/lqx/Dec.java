package com.lqx;

public class Dec {
	public static void main(String[] args) {
//		���� 1 ���ַ�����������ʼ��ֵ
		char ch = 'b';
//		Ȼ����������ַ�ʽ������ֵ�������������ַ�ֵ��unicodeֵ
		ch = 45;
		ch = '\u662f';
		System.out.println("ch���ַ�ֵ��" + ch);
		System.out.println("ch��unicodeֵ��" + (int) ch);
//		�����±���+1��Ȼ������ַ�ֵ
		System.out.println("ch+1���ַ�ֵ��" + (char) (ch + 1));
//		���� 8 �ֻ������ͣ��ֱ��� 1 ������,�ֱ��ʼ���ɲ�ͬ��
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		char c = 'b';
		float f = 0.5f;
		double d = 0.6;
		boolean bool = true;
//		Ȼ��������С�ı����������������ֵ�����ܹ��Զ���ȫ����Ϸ�ʽ��ȫ��д���������� 19�֣�д�� 5 ��
		i = b;
		i = s;
		d = f;
		l = b;
		l = s;
//		����һ���ַ�������������ʼֵ
		String str = "abcd";
//		Ȼ�������ַ��������� 8 �ֻ����������ͽ���+���㣬������
		System.out.println(str + b);
		System.out.println(str + s);
		System.out.println(str + i);
		System.out.println(str + l);
		System.out.println(str + c);
		System.out.println(str + f);
		System.out.println(str + d);
		System.out.println(str + bool);
//		Ȼ���ٸ�ֵΪ��345��������ַ���������������ֵ
		str = "345";
		i = Integer.parseInt(str);
		System.out.println(i);
//		����һ�� short ����ֵ����ֵΪ 1000
		short sh = 1000;
//		Ȼ��Ѵ� short ������ֵ������һ�� byte �ͱ�������ӡ����� byte ���ݣ���������
		b = (byte) sh;
		System.out.println(b);
	}
}

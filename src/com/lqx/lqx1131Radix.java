package com.lqx;

public class lqx1131Radix {
	public static void main(String[] args) {
//		1. ���� 4 �������ͱ������ֱ��� 4 �ֲ�ͬ�Ľ��Ʒ�ʽ�ֱ��ʼ��
		int i2 = 0b1111011;
		int i8 = 0756;
		int i10 = 956;
		int i16 = 0xa2;
//		�ֱ����������ֵ
		System.out.println(i2);
		System.out.println(i8);
		System.out.println(i10);
		System.out.println(i16);
//		2. ����һ�������ͱ����� 4 �ֽ��Ƶķ�ʽ������������������
		int ii=456;
		System.out.println("ii=456��2�������Ϊ��"+Integer.toBinaryString(ii));
		System.out.println("ii=456��8�������Ϊ��"+Integer.toOctalString(ii));
		System.out.println("ii=456��10�������Ϊ��"+ii);
		System.out.println("ii=456��16�������Ϊ��"+Integer.toHexString(ii));
//		3. �ֱ���һ�������ͱ���������ֵ
		int iii=4;
//		ʹ��λ���������ɴ˱����� 16 ������
		System.out.println(iii<<4);
//		ʹ��λ���������ɴ˱������� 4 ������
		System.out.println(iii>>2);
//		ʹ�˱����޷������� 2 λ
		iii>>>=2;
		System.out.println(iii);
//		4. ��� 10 �� 35 ��λ���ֵ
		System.out.println(10&35);
//		5. ��� 38 �� 11 ��λ���ֵ
		System.out.println(38|11);
//		6. ��� 40 �� 30 �� λ����ֵ
		System.out.println(40^30);
//		7. ��� 22 �ķ����ֵ,Ҫ���ֹ�
		System.out.println(~22);
//      0000 0000 0000 0000 0000 0000 0001 0110 ԭ��
//		1111 1111 1111 1111 1111 1111 1110 1001   ����
	}
}

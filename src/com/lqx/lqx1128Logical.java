package com.lqx;

public class lqx1128Logical {
	public static void main(String[] args) {
//		i = 3, j = 6��k =5;
		int i = 3;
		int j = 6;
		int k = 5;
//		���� i ���� j ���� i ���� k �Ľ��
		System.out.println((i > j) && (i > k));
		System.out.println("<----------------------->");
//		��� i С�� k �� j ���� k �Ľ��
		System.out.println((i < k) || (i > k));
		System.out.println("<----------------------->");
//		д��һ��ȡ�������
		System.out.println(!(i < k) || (i > k));
		System.out.println("<----------------------->");
//		д��һ�����������
		System.out.println((i < k) ^ (i > k));
		System.out.println("<----------------------->");
//		ʹ��++��䣬д��ʶ��&����&&��������
		int a = 1;
		System.out.println(1 > 2 && ++a > 1);
		System.out.println(a);
		System.out.println(1 > 2 & ++a > 1);
		System.out.println(a);
		System.out.println("<----------------------->");
//		д��ʶ�� | �� ||��������
		int b = 1;
		System.out.println(2 > 1 || ++b > 1);
		System.out.println(b);
		System.out.println(1 < 2 | ++b > 1);
		System.out.println(b);
		System.out.println("<----------------------->");
//		����Ԫ������ɶ�����ȡ��Сֵ�Ĺ���
		int c=3,d=2;
		System.out.println((c<d)?c:d );
		System.out.println("<----------------------->");
//		����Ԫ�������� 3 ����ȡ���ֵ��
		int e=33,f=12,z=55;
		System.out.println((((e>f)?e:f)>z)?((e>f)?e:f):z );
		System.out.println(true | true & false);
	}
}

package com.lqx;

public class lqx1125Cal {
	public static void main(String[] args) {
		/**
		 * 1. ����������� 
		 * �������������мӼ��˳�ȡ������ 
		 * ����������������ֱ����ǰ�����ͺ��������� 
		 * ����������������ֱ����ǰ�Լ��ͺ��Լ�����
		 */
		int b = 0;
		int c = 0;
		int i = 5;
		int j = 3;
		int x;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);
		System.out.println("<----------------------->");
		System.out.println("i=5:i++Ϊ��" + i++ + "�������iֵΪ" + i);
		System.out.println("j=3:j++Ϊ��" + j++ + "�������jֵΪ" + j);
		System.out.println("<------------------------>");
		System.out.println("i=6:++iΪ��" + ++i + "�������iֵΪ" + i);
		System.out.println("j=4:++jΪ��" + ++j + "�������jֵΪ" + j);
		System.out.println("<------------------------>");
		System.out.println("i=7:i--Ϊ��" + i-- + "�������iֵΪ" + i);
		System.out.println("j=5:j--Ϊ��" + j-- + "�������jֵΪ" + j);
		System.out.println("<------------------------>");
		System.out.println("i=6:--iΪ��" + --i + "�������iֵΪ" + i);
		System.out.println("j=4:--jΪ��" + --j + "�������jֵΪ" + j);
		System.out.println("<------------------------>");
		// 2. ����һ����������дһ���мӼ��˳���ȡģ��������
		float a = 14.4f;
		a=((a+6)-1)/3*3%3;
		System.out.println(a);
		System.out.println("<------------------------>");
		// 3. д�� a=a+1 �ļ�д���
		a+=1;
		// 4. д����ȡģ�����,�� 4 �������������
		System.out.println((-5) % 2);
		System.out.println((-5) % (-2));
		System.out.println(5 % (-2));
		System.out.println(5 % 2);
		System.out.println("<------------------------>");
		// 5. дһ�����������ֵ�������������
		int zs=2,z1=3;
		float fd=2.4f;
		fd=(float)z1/zs;
		System.out.println(fd);
		System.out.println("<------------------------>");
		// 6. д�� b=b+10�� b=b-5�� a=a*b�� c=c/b�� b=b%a �ļ�д���
		b+=10; 
		b-=5;
		a*=b;
		c/=b;
		b%=a;
		// 7. д�� 1 ���� 2 �ıȽϽ�������
		System.out.println(1>2);
		System.out.println("<------------------------>");
		// 8. д���Ƚϡ�a���Ƿ���ڵ��ڡ�b���Ĳ��������
		System.out.println(a>=b);
		System.out.println("<------------------------>");
		// 9. д����abc���Ƿ����ַ������͵Ĳ���

		System.out.println( "abc" instanceof String);
		System.out.println("<------------------------>");
	}
}

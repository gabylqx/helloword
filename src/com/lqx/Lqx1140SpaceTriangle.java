package com.lqx;

import java.util.Scanner;

public class Lqx1140SpaceTriangle {
	public static void main(String[] args) {
//		1. �ȴӼ��̵�������������Ȼ���ӡ�������״��������
//		   *
//		  ***
//	     *****
//		*******
		int x = 1, y = 4;
		while (y > 0) {
			int i = 1;
			while (i <= y) {
				System.out.print(" ");
				i++;
			}
			i = 1;
			while (i <= x) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			x += 2;
			y--;
		}

//		2. ���:
//		ʹ�� do while(true),��ͣ��ִ��
//		�Ӽ����ж��� float ��
//		������ 0 ʱ��ֹͣ����
//		���������
//		��ӡ��
		Scanner sc = new Scanner(System.in);
		float f = 0, n = 0;
		do {
			f = sc.nextFloat();
			if (f > 0) {
				n += f;
			}
			if (f == 0) {
				System.out.println("�����������������ĺ�Ϊ:" + n);
				break;
			}
		} while (true);
	}
}

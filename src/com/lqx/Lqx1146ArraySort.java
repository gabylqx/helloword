package com.lqx;

import java.util.Arrays;

public class Lqx1146ArraySort {
	public static void main(String[] args) {
//		1. ����һ�� 5 ��Ԫ�ص� double ���飬��ʼ����������ʹ��ð�����򣬽��������������
		double[] a = new double[] { 5, 85, 45, 72, 6 };
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print("��" + (i + 1) + "��ִ�У�");
			for (int j = 0; j < a.length - 1 - i; j++) {
				System.out.print((int)a[j]+"�Ƚ�"+(int)a[j+1]+" ");
				if (a[j] > a[j + 1]) {
					double c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
					System.out.print((int)a[j]+"��λ"+(int)a[j+1]+" ");
				}
			}
//			if(swap == 0)
//				break;
			System.out.println();
		}
		System.out.println(Arrays.toString(a));
//		2. ����һ�� 6 ��Ԫ�ص� float ���� arr1��̬��ʼ�������������ʾ����ʹ��ֱ��ѡ�����򷨣��� arr1 ������ʾ arr1
		float[] arr1 = new float[6];
		System.out.println("arr1���������Ϊ��");
		for (int i = 0; i < arr1.length; i++) {
			int max = 100, min = 1;
			arr1[i] = (float) (Math.random() * (max - min) + min);
			System.out.println(arr1[i]);
		}
		System.out.println("-------�����-------");
		for (int j = 0; j < arr1.length - 1; j++) {
			for (int i = j; i < arr1.length-1; i++) {
				System.out.print(arr1[i]+"�Ƚ�"+(int)arr1[i+1]+" ");
				if (arr1[i] > arr1[i + 1]) {
					float f2 = arr1[i];
					arr1[i] = arr1[i + 1];
					arr1[i + 1] = f2;
					System.out.print("��λ ");
				}
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(arr1));
	}
}
package com.lqx;

import java.util.Arrays;

public class Lqx1146ArraySort {
	public static void main(String[] args) {
//		1. 定义一个 5 个元素的 double 数组，初始成乱序数组使用冒泡排序，进行排序，输出内容
		double[] a = new double[] { 5, 85, 45, 72, 6 };
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print("第" + (i + 1) + "次执行：");
			for (int j = 0; j < a.length - 1 - i; j++) {
				System.out.print((int)a[j]+"比较"+(int)a[j+1]+" ");
				if (a[j] > a[j + 1]) {
					double c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
					System.out.print((int)a[j]+"换位"+(int)a[j+1]+" ");
				}
			}
//			if(swap == 0)
//				break;
			System.out.println();
		}
		System.out.println(Arrays.toString(a));
//		2. 定义一个 6 个元素的 float 数组 arr1动态初始化成随机数，显示内容使用直接选择排序法，给 arr1 排序，显示 arr1
		float[] arr1 = new float[6];
		System.out.println("arr1生成随机数为：");
		for (int i = 0; i < arr1.length; i++) {
			int max = 100, min = 1;
			arr1[i] = (float) (Math.random() * (max - min) + min);
			System.out.println(arr1[i]);
		}
		System.out.println("-------排序后-------");
		for (int j = 0; j < arr1.length - 1; j++) {
			for (int i = j; i < arr1.length-1; i++) {
				System.out.print(arr1[i]+"比较"+(int)arr1[i+1]+" ");
				if (arr1[i] > arr1[i + 1]) {
					float f2 = arr1[i];
					arr1[i] = arr1[i + 1];
					arr1[i + 1] = f2;
					System.out.print("换位 ");
				}
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(arr1));
	}
}
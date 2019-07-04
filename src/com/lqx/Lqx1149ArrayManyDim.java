package com.lqx;

import java.util.Arrays;

public class Lqx1149ArrayManyDim {
	public static void main(String[] args) {
//		1. 定义一个 5 个元素的整数二维数组
		int iss[][] = new int[5][];
//		对第 0 行元素，初始化成一个 3 个元素的数组
		iss[0] = new int[3];
//		对于第 4 行，初始化成｛3，4，9，4｝
		iss[3] = new int[] { 3, 4, 9, 4 };
//		用 foreach 方式遍历显示
		for (int a[] : iss) {
			System.out.println(Arrays.toString(a));
		}
		
		for(int b1[]:iss) {
			if(b1!=null) {
				for(int b77:b1) {
					System.out.print(b77+"	");
				}
				System.out.println();
			}	
		}
//		2. 使用静态方法定义一个字符串二维数组
		String strss[][] = new String[3][5];
//		3. 定义一个 6 个元素的 double 数组，初始化成乱序，然后使用数组工具类进行排序，输出
		double dss[] = new double[6];
		for (int i = 0; i < dss.length; i++) {
			dss[i] = Math.random() * 100;
			System.out.println(dss[i]);
		}
		Arrays.sort(dss);
		System.out.println(Arrays.toString(dss));
//		4. 定义一个 10 个元素的 int 数组 arr1，初始化乱序，显示内容
		int arr1[] = new int[10];
		for (int i = 0; i < arr1.length-1; i++) {
			arr1[i] = (int) (Math.random() * 100);
		}
		arr1[arr1.length-1]=789;
		System.out.println(Arrays.toString(arr1));
//		复制 arr1 到一个新的数组 arr2,长度是 15,显示 arr2 内容（while 方式)\\
		int[] arr2 = new int[15];
		arr2 = Arrays.copyOf(arr1, 10);
		int w1=0;
		while(w1<arr2.length) {
			System.out.print(arr2[w1]+ "	");
			w1++;
		}
		System.out.println();
//		复制 arr1 中的内容第 3 至 8 个元素到新的数组 arr3,显示其内容（for 方法)\\
		int[] arr3 = new int[10];
		arr3 = Arrays.copyOfRange(arr1, 2, 7);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+"	");
		}
		System.out.println();
//		给 arr1 排序
		Arrays.sort(arr1);
//		在 arr1 中查询一个有的数据，显示查询结果
		System.out.println("------------------------");
		int binarySearch = Arrays.binarySearch(arr1,789);
		System.out.println(binarySearch);
//		在 arr1 中查询一个没有的数据，显示查询
		System.out.println(Arrays.binarySearch(arr1,283));
	}
}
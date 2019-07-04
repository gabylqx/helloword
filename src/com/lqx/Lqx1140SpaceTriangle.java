package com.lqx;

import java.util.Scanner;

public class Lqx1140SpaceTriangle {
	public static void main(String[] args) {
//		1. 先从键盘当中输入行数，然后打印下面的形状的三角形
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

//		2. 完成:
//		使用 do while(true),不停的执行
//		从键盘中读入 float 数
//		当输入 0 时，停止输入
//		对正数求和
//		打印和
		Scanner sc = new Scanner(System.in);
		float f = 0, n = 0;
		do {
			f = sc.nextFloat();
			if (f > 0) {
				n += f;
			}
			if (f == 0) {
				System.out.println("所输入所有正整数的和为:" + n);
				break;
			}
		} while (true);
	}
}

package com.lqx;

public class lqx1137MultipTables {
	public static void main(String[] args) {
//		��ӡ 99 �˷���
		int x,y;
		for(x=1;x<=9;x++) {
			for(y=1;y<=x;y++) {
				System.out.print(y + "*" + x + "=" + (x*y) + "  " );
			}
			System.out.println();
		}
	}
}

package com.lqx.ex;

import java.util.Scanner;

public class TestLqx1253ExceptionDeclare {
	
	public static void main(String[] args) {
		System.out.println("��������ĸ��");
		while (true) {
			try {
				fun();
				break;
			} catch (Lqx1253ExceptionDeclare e) {
				System.out.println("�����ţ�"+e.getId()+"�������ݣ�"+e.getMessage());
				System.out.println("����������");
			}
			
		}
		System.out.println("������ȷ�������˳�");
	}
	
	private static void fun() throws Lqx1253ExceptionDeclare {
		Scanner sc = new Scanner(System.in);
		char a=sc.next().charAt(0);
		if((a<97||a>122)&&(a>90||a<65)) {
			throw new Lqx1253ExceptionDeclare("��������ֻ��a-z",001);
		}
		
	}
}

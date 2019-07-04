package com.lqx.ex;

import java.util.Scanner;

public class TestLqx1253ExceptionDeclare {
	
	public static void main(String[] args) {
		System.out.println("请输入字母：");
		while (true) {
			try {
				fun();
				break;
			} catch (Lqx1253ExceptionDeclare e) {
				System.out.println("错误编号："+e.getId()+"错误内容："+e.getMessage());
				System.out.println("请重新输入");
			}
			
		}
		System.out.println("输入正确，程序退出");
	}
	
	private static void fun() throws Lqx1253ExceptionDeclare {
		Scanner sc = new Scanner(System.in);
		char a=sc.next().charAt(0);
		if((a<97||a>122)&&(a>90||a<65)) {
			throw new Lqx1253ExceptionDeclare("输入内容只限a-z",001);
		}
		
	}
}

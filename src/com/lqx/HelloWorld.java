package com.lqx;

import java.io.IOException;

public class HelloWorld {
	public static void main(String[] args) throws IOException {
		// 主方法
		System.out.println((int)(0.99));
		System.out.println((int)(99.9));
		char a1 =(char) System.in.read();
		System.out.println("你好世界！！！");
		// 打印字符串信息到控制台
		if (args.length > 0) {
			// 判断：如果有传参执行
			for (int a = 0; a < args.length; a++)
				System.out.println("第" + (a + 1) + "个参数为：" + args[a]);
				//遍历传参并打印控制台
			
		}
	}
}
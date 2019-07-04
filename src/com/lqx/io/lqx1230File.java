package com.lqx.io;

import java.io.File;
import java.io.IOException;

import com.lqx.lqx;

public class lqx1230File {
	public static void main(String[] args) throws IOException {
		File file = new File("d:/lqx/sss1.txt");
//		输出这个文件是否存在，如果不存在，新建这个文件
		if (file.exists()) {
			System.out.println(file.getName() + "文件存在");
		} else {
			System.out.println(file.getName() + "文件不存在，正在创建");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("目录不存在，正在创建");
				File file2 = new File(file.getParent());
				if (!file2.exists()) {
					file2.mkdir();
				}
				file.createNewFile();
			}
			System.out.println("创建成功");
		}
//		输出这个文件长度,是否是文件,是否是目录,是否只读,它所在的绝对路径
		lqx.p();
		System.out.println("文件长度:"+file.length());
		System.out.println("是否是文件:"+file.isFile());
		System.out.println("是否是目录:"+file.isDirectory());
		System.out.println("是否只读:"+file.canRead());
		System.out.println("绝对路径:"+file.getCanonicalFile());
//		File[] listFiles = file.listFiles();
//		for (File f:listFiles) {
//			
//		}
	}
}

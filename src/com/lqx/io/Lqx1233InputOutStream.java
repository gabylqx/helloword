package com.lqx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.lqx.lqx;

public class Lqx1233InputOutStream {
	public static void main(String[] args) throws IOException {
		File file = new File("d:/lqx/sss.txt");
		InputStream i = new FileInputStream(file);
		InputStream i1 = new FileInputStream(file);

//		第一种方式，每次读入一个字节，然后在控制台输出，注意对应汉字有没有正确输出
		int len = i.read();
		while (len != -1) {
			System.out.print((char) len);
			len = i.read();
		}
		lqx.p();
		i.close();

//		第二种方式，每次读入一个 16 字节数组当中，然后输出
		byte[] b = new byte[16];
		len = i1.read(b);
		while (len != -1) {
			System.out.print(new String(b));
			len = i1.read(b);
		}
		lqx.p();
		i1.close();

//		向一个文件写入内容
		File file1 = new File("d:/lqx/sss1.txt");
		OutputStream out = new FileOutputStream(file1);
//		第一种方式，每次写入一个字节
		out.write(111);
		out.write('n');
		out.write(101);
		out.write(13);
//		第二种方式，先把需写入的内容，放到一个字节数组当中，然后写入文件中
		byte[] b1 = { 't', 'w', 111, 13 };
		out.write(b1);
//		第三种方式，每次写入一个字节数组中一部分内容
		out.write(b1, 1, 2);
		out.write(b1, 3, 1);
		out.write(b1, 3, 1);
		out.write(b1, 0, 2);
		out.close();

	}
}

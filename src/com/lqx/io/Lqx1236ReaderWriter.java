package com.lqx.io;

import java.io.*;

import com.lqx.lqx;

public class Lqx1236ReaderWriter {
	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("d:/lqx/writer.txt");
//		第一种方式，每次写入一个字符串
		writer.write("弗拉基米尔（Vladimir、FLADIMIR） 位于俄罗斯欧洲部分的中心，");
		writer.write("是俄罗斯联邦中央联邦区的组成部分。");
		writer.write(13);
//		第二种方式，先把需写入的内容，放到一个字符数组当中，然后每次写入一个字符内容
		char[] b = { '第', '二', '次','写','入','三', 13 };
		for(char a:b) {
		writer.write(a);}
//		第三种方式，每次写入一个字符数组的内容
		char[] b1 = { '第', '三', '次','写','入','四', 13 };
		writer.write(b1);
//		第四种方式，每次写入一个字符数组中一部分
		writer.write(b1,0,1);
		writer.write(b1,5,1);
		writer.write(b1,3,2);
		writer.write(b1,6,1);
		writer.close();

		Reader readed = new FileReader("d:/lqx/writer.txt");
		Reader readed1 = new FileReader("d:/lqx/writer.txt");
//		第一种方式，每次读入一个字节，然后在控制台输出，注意对应汉字有没有正确输出
		int len = readed.read();
		while (len != -1) {
			System.out.print((char) len);
			len = readed.read();
		}
		lqx.p();
		readed.close();

//		第二种方式，每次读入一个8字节数组当中，然后输出
		char[] b2 = new char[8];
		len = readed1.read(b2);
		while (len != -1) {
			System.out.print(new String(b2));
			for (int i = 0; i < b2.length; i++) {
				b2[i]=' ';
			}
			len = readed1.read(b2);
		}
		lqx.p();
		readed1.close();

	}
}







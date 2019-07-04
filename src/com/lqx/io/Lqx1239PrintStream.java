package com.lqx.io;

import java.io.*;
import java.util.Date;

import javax.imageio.stream.FileImageInputStream;

import com.lqx.lqx;

public class Lqx1239PrintStream {
	public static void main(String[] args) throws IOException {
//		1. 写一个打印流，调用 print, println, printf
		PrintStream ps= new PrintStream("d:/lqx/read.txt");
		ps.print("你好");
		ps.println("啊");
		Date date = new Date();
		ps.printf("%tD",date);
//		2. 向一个文件当中写一些你开心内容
		FileReader fr = new FileReader("d:/lqx/read.txt");
		FileWriter fw = new FileWriter("d:/lqx/read.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("无论什么途径获取类对象，都会导致静态属性被初始化，而且只会执行一次。");
		bw.close();
//		写一段代码，从一个文件当中读取数据，输出内容
//		其中要使用到 reset， mark, skip
		for (int i = 0; i < 10; i++) {
			System.out.print((char)br.read());
		}
		lqx.p();
		br.mark(100);
		for (int i = 0; i < 10; i++) {
			System.out.print((char)br.read());
		}
		lqx.p();
		br.reset();
		for (int i = 0; i < 10; i++) {
			System.out.print((char)br.read());
		}
		lqx.p();
		br.skip(2);
		for (int i = 0; i < 10; i++) {
			System.out.print((char)br.read());
		}
	}
}

package com.lqx.io;

import java.io.*;
import java.util.Date;

import javax.imageio.stream.FileImageInputStream;

import com.lqx.lqx;

public class Lqx1239PrintStream {
	public static void main(String[] args) throws IOException {
//		1. дһ����ӡ�������� print, println, printf
		PrintStream ps= new PrintStream("d:/lqx/read.txt");
		ps.print("���");
		ps.println("��");
		Date date = new Date();
		ps.printf("%tD",date);
//		2. ��һ���ļ�����дһЩ�㿪������
		FileReader fr = new FileReader("d:/lqx/read.txt");
		FileWriter fw = new FileWriter("d:/lqx/read.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("����ʲô;����ȡ����󣬶��ᵼ�¾�̬���Ա���ʼ��������ֻ��ִ��һ�Ρ�");
		bw.close();
//		дһ�δ��룬��һ���ļ����ж�ȡ���ݣ��������
//		����Ҫʹ�õ� reset�� mark, skip
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

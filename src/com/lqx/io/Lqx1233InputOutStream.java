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

//		��һ�ַ�ʽ��ÿ�ζ���һ���ֽڣ�Ȼ���ڿ���̨�����ע���Ӧ������û����ȷ���
		int len = i.read();
		while (len != -1) {
			System.out.print((char) len);
			len = i.read();
		}
		lqx.p();
		i.close();

//		�ڶ��ַ�ʽ��ÿ�ζ���һ�� 16 �ֽ����鵱�У�Ȼ�����
		byte[] b = new byte[16];
		len = i1.read(b);
		while (len != -1) {
			System.out.print(new String(b));
			len = i1.read(b);
		}
		lqx.p();
		i1.close();

//		��һ���ļ�д������
		File file1 = new File("d:/lqx/sss1.txt");
		OutputStream out = new FileOutputStream(file1);
//		��һ�ַ�ʽ��ÿ��д��һ���ֽ�
		out.write(111);
		out.write('n');
		out.write(101);
		out.write(13);
//		�ڶ��ַ�ʽ���Ȱ���д������ݣ��ŵ�һ���ֽ����鵱�У�Ȼ��д���ļ���
		byte[] b1 = { 't', 'w', 111, 13 };
		out.write(b1);
//		�����ַ�ʽ��ÿ��д��һ���ֽ�������һ��������
		out.write(b1, 1, 2);
		out.write(b1, 3, 1);
		out.write(b1, 3, 1);
		out.write(b1, 0, 2);
		out.close();

	}
}

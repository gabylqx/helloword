package com.lqx.io;

import java.io.*;

import com.lqx.lqx;

public class Lqx1236ReaderWriter {
	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("d:/lqx/writer.txt");
//		��һ�ַ�ʽ��ÿ��д��һ���ַ���
		writer.write("�������׶���Vladimir��FLADIMIR�� λ�ڶ���˹ŷ�޲��ֵ����ģ�");
		writer.write("�Ƕ���˹������������������ɲ��֡�");
		writer.write(13);
//		�ڶ��ַ�ʽ���Ȱ���д������ݣ��ŵ�һ���ַ����鵱�У�Ȼ��ÿ��д��һ���ַ�����
		char[] b = { '��', '��', '��','д','��','��', 13 };
		for(char a:b) {
		writer.write(a);}
//		�����ַ�ʽ��ÿ��д��һ���ַ����������
		char[] b1 = { '��', '��', '��','д','��','��', 13 };
		writer.write(b1);
//		�����ַ�ʽ��ÿ��д��һ���ַ�������һ����
		writer.write(b1,0,1);
		writer.write(b1,5,1);
		writer.write(b1,3,2);
		writer.write(b1,6,1);
		writer.close();

		Reader readed = new FileReader("d:/lqx/writer.txt");
		Reader readed1 = new FileReader("d:/lqx/writer.txt");
//		��һ�ַ�ʽ��ÿ�ζ���һ���ֽڣ�Ȼ���ڿ���̨�����ע���Ӧ������û����ȷ���
		int len = readed.read();
		while (len != -1) {
			System.out.print((char) len);
			len = readed.read();
		}
		lqx.p();
		readed.close();

//		�ڶ��ַ�ʽ��ÿ�ζ���һ��8�ֽ����鵱�У�Ȼ�����
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







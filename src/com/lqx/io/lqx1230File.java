package com.lqx.io;

import java.io.File;
import java.io.IOException;

import com.lqx.lqx;

public class lqx1230File {
	public static void main(String[] args) throws IOException {
		File file = new File("d:/lqx/sss1.txt");
//		�������ļ��Ƿ���ڣ���������ڣ��½�����ļ�
		if (file.exists()) {
			System.out.println(file.getName() + "�ļ�����");
		} else {
			System.out.println(file.getName() + "�ļ������ڣ����ڴ���");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Ŀ¼�����ڣ����ڴ���");
				File file2 = new File(file.getParent());
				if (!file2.exists()) {
					file2.mkdir();
				}
				file.createNewFile();
			}
			System.out.println("�����ɹ�");
		}
//		�������ļ�����,�Ƿ����ļ�,�Ƿ���Ŀ¼,�Ƿ�ֻ��,�����ڵľ���·��
		lqx.p();
		System.out.println("�ļ�����:"+file.length());
		System.out.println("�Ƿ����ļ�:"+file.isFile());
		System.out.println("�Ƿ���Ŀ¼:"+file.isDirectory());
		System.out.println("�Ƿ�ֻ��:"+file.canRead());
		System.out.println("����·��:"+file.getCanonicalFile());
//		File[] listFiles = file.listFiles();
//		for (File f:listFiles) {
//			
//		}
	}
}

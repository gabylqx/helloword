package com.lqx;

import java.io.IOException;

public class HelloWorld {
	public static void main(String[] args) throws IOException {
		// ������
		System.out.println((int)(0.99));
		System.out.println((int)(99.9));
		char a1 =(char) System.in.read();
		System.out.println("������磡����");
		// ��ӡ�ַ�����Ϣ������̨
		if (args.length > 0) {
			// �жϣ�����д���ִ��
			for (int a = 0; a < args.length; a++)
				System.out.println("��" + (a + 1) + "������Ϊ��" + args[a]);
				//�������β���ӡ����̨
			
		}
	}
}
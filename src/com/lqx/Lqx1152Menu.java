package com.lqx;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lqx1152Menu {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String news[][] = new String[30][];
		int num = 1;// �����½�������
		String menu[] = { "1. �Ǽǹ���", "2. ��ʾ�ѵǼ���Ϣ", "3. ��ѯ����", "4. �޸Ĺ���", "5. ɾ������", "�������Ӧ��Ų��س�������Ӧ���ܣ�" };
		while (true) {
			String in;
			for (String i : menu) {
				System.out.println(i);
			}
			in = sc.next();
			switch (in) {
			case "1":
				String newsName;
				String newsPr;
				String newsId = String.valueOf(num);
				System.out.println("��������Ҫ¼�����Ʒ���ƣ��س�������:");
				newsName = sc.next();
				System.out.println("��������Ҫ¼����Ʒ  " + newsName + " �ļ۸񣬻س�������:");
				newsPr = sc.next();
				news[num - 1] = new String[] { newsId, newsName, newsPr };
				System.out.println(
						"��ӳɹ�����ţ�" + news[num - 1][0] + " ��Ʒ���ƣ�" + news[num - 1][1] + " �۸�" + news[num - 1][2]);
				num++;
				dd();
				break;
			case "2":
				for (int i = 0; i < num - 1; i++) {
					if (news[i] != null)
						System.out.println(
								"��ţ�" + news[i][0] + " ��Ʒ���ƣ�" + news[i][1] + " �۸�" + news[i][2] + ",����������������˵�");
				}
				System.out.println("��ѯ���");
				dd();
			default:
				break;
			case "3":
				String in3 = null;
				System.out.println("1. ��Ʒ��ž�׼����");
				System.out.println("2. ��Ʒ���ƹؼ���ģ������");
				System.out.println("�������Ӧ��Ų��س�������Ӧ���ܣ�");
				in3 = sc.next();
				if ("1".equals(in3)) {
					System.out.println("��������Ʒ����Ӧ�ı�ţ��س���������");
					System.out.println("����ʾ��Ŀǰ��Ʒ����Ϊ:1-" + (num - 1) + ",�����뷶Χ�ڵı����ֵ��");
					int i2 = sc.nextInt();
					if (news[i2 - 1] != null)
						System.out.println("����" + i2 + "����Ʒ��ϢΪ����ţ�" + news[i2 - 1][0] + " ��Ʒ���ƣ�" + news[i2 - 1][1]
								+ " �۸�" + news[i2 - 1][2] + " ,����������������˵�");
					System.out.println("�Բ���δ�ҵ�����ҵ���Ϣ�Ѿ�ɾ��������");
					dd();
					break;
				}
				if ("2".equals(in3)) {
					System.out.println("��������Ʒ���ƹؼ��֣�֧��ģ���������س���������");
					in3 = sc.next();
					boolean bl = true;// �ж��Ƿ��ѯ����Ϣ
					for (int i = 0; i < num - 1; i++) {
						if (news[i][1].contains(in3)) {
							bl = false;
							System.out.println("����" + in3 + " ����Ʒ��ϢΪ����ţ�" + news[i][0] + " ��Ʒ���ƣ�" + news[i][1] + " �۸�"
									+ news[i][2] + " ");
						}
					}
					if (bl) {
						System.out.println("�Բ���û�в�ѯ���������Ϣ");
					}
					dd();
					break;
				}
				System.out.println("��������ȷ����ţ�������");
				dd();
				System.out.println();
			case "4":
				String newName;
				String newPr;
				System.out.println("��������Ҫ�޸���Ʒ����Ӧ�ı�ţ��س���������");
				System.out.println("����ʾ��Ŀǰ��Ʒ����Ϊ:1-" + (num - 1) + ",�����뷶Χ�ڵı����ֵ��");
				int i2 = sc.nextInt();
				if (news[i2 - 1] == null) {
					System.out.println("�Բ���δ�ҵ��˱�ŵ���Ϣ�������ѱ�ɾ��");
					dd();
					break;
				}
				System.out.println(
						"�޸ĵ���Ʒ��ϢΪ����ţ�" + news[i2 - 1][0] + " ��Ʒ���ƣ�" + news[i2 - 1][1] + " �۸�" + news[i2 - 1][2] + " ");
				System.out.println("��������Ϊ��" + i2 + " ����Ʒ�����ƣ��س�������:");
				newName = sc.next();
				System.out.println("��������Ҫ�޸���Ʒ  " + newName + " �ļ۸񣬻س�������:");
				newPr = sc.next();
				news[i2 - 1][1] = newName;
				news[i2 - 1][2] = newPr;
				System.out
						.println("�޸ĳɹ�����ţ�" + news[i2 - 1][0] + " ��Ʒ���ƣ�" + news[i2 - 1][1] + " �۸�" + news[i2 - 1][2]);
				dd();
			case "5":
				System.out.println("��������Ҫ�޸���Ʒ����Ӧ�ı�ţ��س���������");
				System.out.println("����ʾ��Ŀǰ��Ʒ����Ϊ:1-" + (num - 1) + ",�����뷶Χ�ڵı����ֵ��");
				int i3 = sc.nextInt();
				if (news[i3 - 1] != null) {
					news[i3 - 1] = null;
					System.out.println("ɾ���ɹ���");
				} else {
					System.out.println("��Ų����ڣ�����ɾ����");
				}
				dd();
			}
			if ("0".equals(in)) {
				System.out.println("ллʹ�ñ�ϵͳ");
				break;
			}
		}
	}

	static void dd() throws IOException {
		System.out.println("���»س��������˵�");
		char a1 = (char) System.in.read();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}

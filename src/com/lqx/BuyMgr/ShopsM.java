package com.lqx.BuyMgr;

import java.io.*;
import java.util.*;

public class ShopsM {
	public static void main(String[] args) throws IOException {
		String menu[] = { "1. �����µ�����Ϣ", "2. ��ʾ�ѵǼǵ�����Ϣ", "3. �������е�����Ϣ", 
				"4. �޸����е�����Ϣ", "6. ���������Ϣ", "0. �˳�ϵͳ" };
		List<String> ls = new ArrayList<String>();
		ls.add("1");
		ls.add("2");
		ls.add("3");
		ls.add("4");
		ls.add("6");
		ls.add("0");
		while (true) {
			for (String i : menu) {
				System.out.println(i);
			}
			String a = ins(1);
			if (Collections.frequency(ls, a) == 0) {
				System.out.println("��������ȷ���");
				continue;
			}
			switch (a) {
			case "1":
				addShops();
				break;
			case "2":
				showShops();
				break;
			case "3":
				searchShops();
				break;
			case "4":
				updateShops();
				break;
			case "6":
				saveShops();
				break;
			default:
				break;
			}
			if ("0".equals(a)) {
				System.out.println("ллʹ��ϵͳ���ٻᣡ");
				break;
			}
			cl(false);
		}

	}

	private static String ins(int i) {
		switch (i) {
		case 1:
			System.out.println("��������Ҫ���빦�ܵ���ţ��س�������:");
			break;
		case 2:
			System.out.println("��������Ҫ¼��ĵ��̱�ţ��س�������:");
			break;
		case 3:
			System.out.println("��������Ҫ¼��ĵ������ƣ��س�������:");
			break;
		case 4:
			System.out.println("��������Ҫ¼��ĵ��̼۸񣬻س�������:");
			break;
		case 6:
			System.out.println("��������Ҫ��ѯ�ĵ�����Ϣ��֧��ģ�����������س�������:");
			break;
		case 7:
			System.out.println("��������Ҫ�޸ĵĵ��̱�ţ��س�������:");
			break;
		case 5:
			System.out.println("");
			break;
		default:
			break;
		}
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

//	��������
	private static void addShops() {
		String no = ins(2);
		String name = ins(3);
		Shops shops = new Shops(no, name);
		ShopsMgr.list.add(shops);
		cl(true);
	}

//	��ʾȫ������
	public static void showShops() {

		for (Shops oj : ShopsMgr.list) {
			System.out.println(oj.toString());
		}
		cl(true);
	}

//	���ҵ���
	public static void searchShops() {
		String s = ins(6);
		System.out.println(s);
		for (int i = 0; i < ShopsMgr.list.size(); i++) {
			Shops shops = ShopsMgr.list.get(i);
			if (shops.getNo().contains(s) || shops.getName().contains(s)) {
				System.out.println("������ѯ�ĵ�����Ϣ����" + shops.toString());
			}
		}
		cl(true);
	}

//	�޸ĵ���
	public static void updateShops() {
		String s = ins(7);
		System.out.println(s);
		Shops shops = null;
		for (int i = 0; i < ShopsMgr.list.size(); i++) {
			shops = ShopsMgr.list.get(i);
			if (shops.getNo().contains(s)) {
				System.out.println("��Ҫ�޸ĵĵ�����Ϣ����" + shops.toString());
			}
		}
		if (shops.equals(null)) {
			System.out.println("�Բ���û�д˱�ŵĵ���");
		} else {
			System.out.println("��������Ҫ�޸ĵĵ��̱�ţ��س�������:");
			String no = ins(50);
			System.out.println("��������Ҫ�޸ĵĵ������ƣ��س�������:");
			String name = ins(50);
			Shops newShops = new Shops(no, name);
			Collections.replaceAll(ShopsMgr.list, shops, newShops);
		}
		cl(true);
	}

//	���������Ϣ
	public static void saveShops() throws IOException {
		File file = new File("d:/lqx/shops.txt");
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		System.out.println("��ʼ�����ļ�");
		for (Shops shops : ShopsMgr.list) {
			oos.writeObject(shops);
			System.out.print(".");
		}
		System.out.println("�ļ�����ɹ���·��:" + file.getPath());
	}

	public static void cl(boolean a) {
		if (a) {
			System.out.println("�����������...");
			Scanner sc = new Scanner(System.in);
			sc.next();
		} else {
			for (int i = 0; i < 10; i++) {
				System.out.println();
			}
		}
	}
}

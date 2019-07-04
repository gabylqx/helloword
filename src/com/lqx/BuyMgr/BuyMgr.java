package com.lqx.BuyMgr;

import java.io.*;
import java.util.*;

public class BuyMgr {
	public static void main(String[] args) throws IOException {
		String menu[] = { "1. ��������Ʒ��Ϣ", "2. ��ʾ�ѵǼ���Ʒ��Ϣ", "3. ����������Ʒ��Ϣ", 
				"4. �޸�������Ʒ��Ϣ", "6. ������Ʒ��Ϣ", "0. �˳�ϵͳ" };
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
				addGoods();
				break;
			case "2":
				showGoods();
				break;
			case "3":
				searchGoods();
				break;
			case "4":
				updateGoods();
				break;
			case "6":
				saveGoods();
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
			System.out.println("��������Ҫ¼�����Ʒ��ţ��س�������:");
			break;
		case 3:
			System.out.println("��������Ҫ¼�����Ʒ���ƣ��س�������:");
			break;
		case 4:
			System.out.println("��������Ҫ¼�����Ʒ�۸񣬻س�������:");
			break;
		case 6:
			System.out.println("��������Ҫ��ѯ����Ʒ��Ϣ��֧��ģ�����������س�������:");
			break;
		case 7:
			System.out.println("��������Ҫ�޸ĵ���Ʒ��ţ��س�������:");
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

//	������Ʒ
	private static void addGoods() {
		String no = ins(2);
		String name = ins(3);
		double pr = Double.parseDouble(ins(4));
		Goods goods = new Goods(no, name, pr);
		GoodsMgr.list.add(goods);
		cl(true);
	}

//	��ʾȫ����Ʒ
	public static void showGoods() {

		for (Goods oj : GoodsMgr.list) {
			System.out.println(oj.toString());
		}
		cl(true);
	}

//	������Ʒ
	public static void searchGoods() {
		String s = ins(6);
		System.out.println(s);
		for (int i = 0; i < GoodsMgr.list.size(); i++) {
			Goods good = GoodsMgr.list.get(i);
			if (good.getNo().contains(s) || good.getName().contains(s)) {
				System.out.println("������ѯ����Ʒ��Ϣ����" + good.toString());
			}
		}
		cl(true);
	}

//	�޸���Ʒ
	public static void updateGoods() {
		String s = ins(7);
		System.out.println(s);
		Goods good = null;
		for (int i = 0; i < GoodsMgr.list.size(); i++) {
			good = GoodsMgr.list.get(i);
			if (good.getNo().contains(s)) {
				System.out.println("��Ҫ�޸ĵ���Ʒ��Ϣ����" + good.toString());
			}
		}
		if (good.equals(null)) {
			System.out.println("�Բ���û�д˱�ŵ���Ʒ");
		} else {
			System.out.println("��������Ҫ�޸ĵ���Ʒ��ţ��س�������:");
			String no = ins(50);
			System.out.println("��������Ҫ�޸ĵ���Ʒ���ƣ��س�������:");
			String name = ins(50);
			System.out.println("��������Ҫ�޸ĵ���Ʒ�۸񣬻س�������:");
			double pr = Double.parseDouble(ins(50));
			Goods newGood = new Goods(no, name, pr);
			Collections.replaceAll(GoodsMgr.list, good, newGood);
		}
		cl(true);
	}

//	������Ʒ��Ϣ
	public static void saveGoods() throws IOException {
		File file = new File("d:/lqx/goods.txt");
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		System.out.println("��ʼ�����ļ�");
		for (Goods good : GoodsMgr.list) {
			oos.writeObject(good);
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

package com.lqx.BuyMgr;

import java.io.*;
import java.util.*;

public class BuyMgr {
	public static void main(String[] args) throws IOException {
		String menu[] = { "1. 新增新商品信息", "2. 显示已登记商品信息", "3. 查找已有商品信息", 
				"4. 修改已有商品信息", "6. 保存商品信息", "0. 退出系统" };
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
				System.out.println("请输入正确序号");
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
				System.out.println("谢谢使用系统，再会！");
				break;
			}
			cl(false);
		}

	}

	private static String ins(int i) {
		switch (i) {
		case 1:
			System.out.println("请输入需要进入功能的序号，回车键结束:");
			break;
		case 2:
			System.out.println("请输入需要录入的商品编号，回车键结束:");
			break;
		case 3:
			System.out.println("请输入需要录入的商品名称，回车键结束:");
			break;
		case 4:
			System.out.println("请输入需要录入的商品价格，回车键结束:");
			break;
		case 6:
			System.out.println("请输入需要查询的商品信息（支持模糊搜索），回车键结束:");
			break;
		case 7:
			System.out.println("请输入需要修改的商品编号，回车键结束:");
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

//	新增商品
	private static void addGoods() {
		String no = ins(2);
		String name = ins(3);
		double pr = Double.parseDouble(ins(4));
		Goods goods = new Goods(no, name, pr);
		GoodsMgr.list.add(goods);
		cl(true);
	}

//	显示全部商品
	public static void showGoods() {

		for (Goods oj : GoodsMgr.list) {
			System.out.println(oj.toString());
		}
		cl(true);
	}

//	查找商品
	public static void searchGoods() {
		String s = ins(6);
		System.out.println(s);
		for (int i = 0; i < GoodsMgr.list.size(); i++) {
			Goods good = GoodsMgr.list.get(i);
			if (good.getNo().contains(s) || good.getName().contains(s)) {
				System.out.println("您所查询的商品信息如下" + good.toString());
			}
		}
		cl(true);
	}

//	修改商品
	public static void updateGoods() {
		String s = ins(7);
		System.out.println(s);
		Goods good = null;
		for (int i = 0; i < GoodsMgr.list.size(); i++) {
			good = GoodsMgr.list.get(i);
			if (good.getNo().contains(s)) {
				System.out.println("您要修改的商品信息如下" + good.toString());
			}
		}
		if (good.equals(null)) {
			System.out.println("对不起，没有此编号的商品");
		} else {
			System.out.println("请输入需要修改的商品编号，回车键结束:");
			String no = ins(50);
			System.out.println("请输入需要修改的商品名称，回车键结束:");
			String name = ins(50);
			System.out.println("请输入需要修改的商品价格，回车键结束:");
			double pr = Double.parseDouble(ins(50));
			Goods newGood = new Goods(no, name, pr);
			Collections.replaceAll(GoodsMgr.list, good, newGood);
		}
		cl(true);
	}

//	保存商品信息
	public static void saveGoods() throws IOException {
		File file = new File("d:/lqx/goods.txt");
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		System.out.println("开始保存文件");
		for (Goods good : GoodsMgr.list) {
			oos.writeObject(good);
			System.out.print(".");
		}
		System.out.println("文件保存成功，路径:" + file.getPath());
	}

	public static void cl(boolean a) {
		if (a) {
			System.out.println("按任意键返回...");
			Scanner sc = new Scanner(System.in);
			sc.next();
		} else {
			for (int i = 0; i < 10; i++) {
				System.out.println();
			}
		}
	}
}

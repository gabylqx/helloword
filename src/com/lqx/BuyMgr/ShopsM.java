package com.lqx.BuyMgr;

import java.io.*;
import java.util.*;

public class ShopsM {
	public static void main(String[] args) throws IOException {
		String menu[] = { "1. 新增新店铺信息", "2. 显示已登记店铺信息", "3. 查找已有店铺信息", 
				"4. 修改已有店铺信息", "6. 保存店铺信息", "0. 退出系统" };
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
			System.out.println("请输入需要录入的店铺编号，回车键结束:");
			break;
		case 3:
			System.out.println("请输入需要录入的店铺名称，回车键结束:");
			break;
		case 4:
			System.out.println("请输入需要录入的店铺价格，回车键结束:");
			break;
		case 6:
			System.out.println("请输入需要查询的店铺信息（支持模糊搜索），回车键结束:");
			break;
		case 7:
			System.out.println("请输入需要修改的店铺编号，回车键结束:");
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

//	新增店铺
	private static void addShops() {
		String no = ins(2);
		String name = ins(3);
		Shops shops = new Shops(no, name);
		ShopsMgr.list.add(shops);
		cl(true);
	}

//	显示全部店铺
	public static void showShops() {

		for (Shops oj : ShopsMgr.list) {
			System.out.println(oj.toString());
		}
		cl(true);
	}

//	查找店铺
	public static void searchShops() {
		String s = ins(6);
		System.out.println(s);
		for (int i = 0; i < ShopsMgr.list.size(); i++) {
			Shops shops = ShopsMgr.list.get(i);
			if (shops.getNo().contains(s) || shops.getName().contains(s)) {
				System.out.println("您所查询的店铺信息如下" + shops.toString());
			}
		}
		cl(true);
	}

//	修改店铺
	public static void updateShops() {
		String s = ins(7);
		System.out.println(s);
		Shops shops = null;
		for (int i = 0; i < ShopsMgr.list.size(); i++) {
			shops = ShopsMgr.list.get(i);
			if (shops.getNo().contains(s)) {
				System.out.println("您要修改的店铺信息如下" + shops.toString());
			}
		}
		if (shops.equals(null)) {
			System.out.println("对不起，没有此编号的店铺");
		} else {
			System.out.println("请输入需要修改的店铺编号，回车键结束:");
			String no = ins(50);
			System.out.println("请输入需要修改的店铺名称，回车键结束:");
			String name = ins(50);
			Shops newShops = new Shops(no, name);
			Collections.replaceAll(ShopsMgr.list, shops, newShops);
		}
		cl(true);
	}

//	保存店铺信息
	public static void saveShops() throws IOException {
		File file = new File("d:/lqx/shops.txt");
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		System.out.println("开始保存文件");
		for (Shops shops : ShopsMgr.list) {
			oos.writeObject(shops);
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

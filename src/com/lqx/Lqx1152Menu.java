package com.lqx;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lqx1152Menu {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String news[][] = new String[30][];
		int num = 1;// 控制新建计数器
		String menu[] = { "1. 登记功能", "2. 显示已登记信息", "3. 查询功能", "4. 修改功能", "5. 删除功能", "请输入对应序号并回车进入相应功能：" };
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
				System.out.println("请输入需要录入的商品名称，回车键结束:");
				newsName = sc.next();
				System.out.println("请输入需要录入商品  " + newsName + " 的价格，回车键结束:");
				newsPr = sc.next();
				news[num - 1] = new String[] { newsId, newsName, newsPr };
				System.out.println(
						"添加成功，编号：" + news[num - 1][0] + " 商品名称：" + news[num - 1][1] + " 价格：" + news[num - 1][2]);
				num++;
				dd();
				break;
			case "2":
				for (int i = 0; i < num - 1; i++) {
					if (news[i] != null)
						System.out.println(
								"编号：" + news[i][0] + " 商品名称：" + news[i][1] + " 价格：" + news[i][2] + ",输入任意键返回主菜单");
				}
				System.out.println("查询完成");
				dd();
			default:
				break;
			case "3":
				String in3 = null;
				System.out.println("1. 商品编号精准查找");
				System.out.println("2. 商品名称关键字模糊查找");
				System.out.println("请输入对应序号并回车进入相应功能：");
				in3 = sc.next();
				if ("1".equals(in3)) {
					System.out.println("请输入商品所对应的编号，回车键结束：");
					System.out.println("（提示：目前商品库编号为:1-" + (num - 1) + ",请输入范围内的编号数值）");
					int i2 = sc.nextInt();
					if (news[i2 - 1] != null)
						System.out.println("查找" + i2 + "的商品信息为：编号：" + news[i2 - 1][0] + " 商品名称：" + news[i2 - 1][1]
								+ " 价格：" + news[i2 - 1][2] + " ,输入任意键返回主菜单");
					System.out.println("对不起，未找到或查找的信息已经删除！！！");
					dd();
					break;
				}
				if ("2".equals(in3)) {
					System.out.println("请输入商品名称关键字，支持模糊搜索，回车键结束：");
					in3 = sc.next();
					boolean bl = true;// 判断是否查询到信息
					for (int i = 0; i < num - 1; i++) {
						if (news[i][1].contains(in3)) {
							bl = false;
							System.out.println("查找" + in3 + " 的商品信息为：编号：" + news[i][0] + " 商品名称：" + news[i][1] + " 价格："
									+ news[i][2] + " ");
						}
					}
					if (bl) {
						System.out.println("对不起，没有查询到输入的信息");
					}
					dd();
					break;
				}
				System.out.println("请输入正确的序号！！！！");
				dd();
				System.out.println();
			case "4":
				String newName;
				String newPr;
				System.out.println("请输入需要修改商品所对应的编号，回车键结束：");
				System.out.println("（提示：目前商品库编号为:1-" + (num - 1) + ",请输入范围内的编号数值）");
				int i2 = sc.nextInt();
				if (news[i2 - 1] == null) {
					System.out.println("对不起，未找到此编号的信息，可能已被删除");
					dd();
					break;
				}
				System.out.println(
						"修改的商品信息为：编号：" + news[i2 - 1][0] + " 商品名称：" + news[i2 - 1][1] + " 价格：" + news[i2 - 1][2] + " ");
				System.out.println("请输入编号为：" + i2 + " 的商品新名称，回车键结束:");
				newName = sc.next();
				System.out.println("请输入需要修改商品  " + newName + " 的价格，回车键结束:");
				newPr = sc.next();
				news[i2 - 1][1] = newName;
				news[i2 - 1][2] = newPr;
				System.out
						.println("修改成功，编号：" + news[i2 - 1][0] + " 商品名称：" + news[i2 - 1][1] + " 价格：" + news[i2 - 1][2]);
				dd();
			case "5":
				System.out.println("请输入需要修改商品所对应的编号，回车键结束：");
				System.out.println("（提示：目前商品库编号为:1-" + (num - 1) + ",请输入范围内的编号数值）");
				int i3 = sc.nextInt();
				if (news[i3 - 1] != null) {
					news[i3 - 1] = null;
					System.out.println("删除成功！");
				} else {
					System.out.println("编号不存在，无需删除！");
				}
				dd();
			}
			if ("0".equals(in)) {
				System.out.println("谢谢使用本系统");
				break;
			}
		}
	}

	static void dd() throws IOException {
		System.out.println("按下回车返回主菜单");
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

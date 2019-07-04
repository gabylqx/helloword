package com.lqx.Directory;

import java.util.*;

public class Directory {
	public static void main(String[] args) {
		String menu[] = { "1. 新增单词", "2. 显示所有单词", "3. 查找单词", "4. 退出" };
		Map<String, String> words = new TreeMap<String, String>();
		List<String> ls = new ArrayList<String>();
		ls.add("1");
		ls.add("2");
		ls.add("3");
		ls.add("4");
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
				words = cWords(words);
				break;
			case "2":
				rWords(words);
				break;
			case "3":
				sWords(words);
				break;
			default:
				break;
			}
			if ("4".equals(a)) {
				System.out.println("谢谢使用本字典，再会！");
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
			System.out.println("请输入需要录入的英文单词，回车键结束:");
			break;
		case 3:
			System.out.println("请输入刚刚录入的单词中文解释，回车键结束:");
			break;
		case 4:
			System.out.println("请输入要查询的单词，回车键结束:");
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

//	新增单词
	public static Map<String, String> cWords(Map<String, String> map) {
		String s1 = ins(2);
		String s2 = ins(3);
		map.put(s1, s2);
		System.out.println(s1 + "已经录入,对应的中文解释为：" + map.get(s1));
		cl(true);
		return map;
	}

//	显示全部单词
	public static void rWords(Map<String, String> words) {
		Set<String> set = words.keySet();
		for (Object oj : set) {
			System.out.println(oj + "对应的中文解释为：" + words.get(oj));
		}
		cl(true);
	}

//	查找单词
	public static void sWords(Map<String, String> words) {
		String s = ins(4);
		System.out.println(s);
		if (words.get(s) == null) {
			System.out.println("对不起 未查询到本单词，请先录入");
			cl(true);
		} else {
			System.out.println(s + "对应的中文解释为：" + words.get(s));
			cl(true);
		}
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

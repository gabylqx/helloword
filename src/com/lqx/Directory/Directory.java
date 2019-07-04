package com.lqx.Directory;

import java.util.*;

public class Directory {
	public static void main(String[] args) {
		String menu[] = { "1. ��������", "2. ��ʾ���е���", "3. ���ҵ���", "4. �˳�" };
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
				System.out.println("��������ȷ���");
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
				System.out.println("ллʹ�ñ��ֵ䣬�ٻᣡ");
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
			System.out.println("��������Ҫ¼���Ӣ�ĵ��ʣ��س�������:");
			break;
		case 3:
			System.out.println("������ո�¼��ĵ������Ľ��ͣ��س�������:");
			break;
		case 4:
			System.out.println("������Ҫ��ѯ�ĵ��ʣ��س�������:");
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
	public static Map<String, String> cWords(Map<String, String> map) {
		String s1 = ins(2);
		String s2 = ins(3);
		map.put(s1, s2);
		System.out.println(s1 + "�Ѿ�¼��,��Ӧ�����Ľ���Ϊ��" + map.get(s1));
		cl(true);
		return map;
	}

//	��ʾȫ������
	public static void rWords(Map<String, String> words) {
		Set<String> set = words.keySet();
		for (Object oj : set) {
			System.out.println(oj + "��Ӧ�����Ľ���Ϊ��" + words.get(oj));
		}
		cl(true);
	}

//	���ҵ���
	public static void sWords(Map<String, String> words) {
		String s = ins(4);
		System.out.println(s);
		if (words.get(s) == null) {
			System.out.println("�Բ��� δ��ѯ�������ʣ�����¼��");
			cl(true);
		} else {
			System.out.println(s + "��Ӧ�����Ľ���Ϊ��" + words.get(s));
			cl(true);
		}
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

package com.lqx;

public class Lqx1193String {
	public static void main(String[] args) {
//		使用 3 种构造方法，实例化字符串
		String s = new String("vae");
		char a[] = new char[] {'a','b','c','d','f'};
		String s1 = new String(a);
		String s2 = new String(a,0,3);
		System.out.println(s+s1+s2);
//		检查一个字符串是否是"abc"开头
		System.out.println(s1.startsWith("abc"));
//		检查一个字符串是否以 xyz 结尾
		System.out.println(s2.endsWith("xyz"));
//		比校 cde 与 fgh 的大小
		System.out.println("cde".compareTo("fgh"));
//		不分大小写的比较 xyz 与 abc 的大小
		System.out.println("xyz".compareToIgnoreCase("abc"));
//		检查一个字符串是否有 df 的内容
		System.out.println(s1.concat("df"));
//		输出"jhg"在”abcdefghjhgijklmn”中的所在位置
		String s4 = "abcdefghjhgijklmn";
		System.out.println(s4.indexOf("jhg"));
//		输出"jhg"在”abcdefghjhgijklmjhgn”中的从第 12 个字符开始数的所在位置
		System.out.println("abcdefghjhgijklmjhgn".indexOf("jhg", 12));
//		输出"ihj"在某个”abcdefghjhjijklihjmihjn”最后出现的位置
//		取出某一个字符串从第 6 个字符开始的子串
		System.out.println("sUCHSKXUCBDGCIShs".substring(6));
//		把某一个字符串的第 3 至 5 位的内容替换成 123
		System.out.println("sUCHSKXUCBDGCIShs".replace("CHS", "123"));
//		把 how are your ?以空格为分隔符，转换成字符串数组
		String[] str = "how are your ?".split(" ");
		for(String ss:str) {
			System.out.println(ss);
		}
		
	}
}

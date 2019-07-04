package com.lqx;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Lqx1320Regex {
	public static void main(String[] args) {
//		使用正则表达式，检验输入的密码是否合格
//		至少要 6 位,只能由数字或字母组成
//		使用正则表达式，完成分割、替换、获取功能
//		分别写一个示例
		String regex = "[\\da-zA-Z]{6}";
		String passWord = "524s54";
		String passWord1 = "5_4s54";
		System.out.println(passWord.matches(regex));
		System.out.println(passWord1.matches(regex));
		//分割
		String str1="落霞/与孤鹜/齐飞/秋水/共长天/一色";
		String[] strs = str1.split("/");
		System.out.println(Arrays.toString(strs));
		//替换
		str1="you tel 18954585458 my tel 15652528458";
		System.out.println(str1.replaceAll("[1][3,4,5,7,8][0-9]{9}","****"));
		//获取
		regex = "[1][3,4,5,7,8][0-9]{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str1);
		while (m.find()) {
			System.out.println(m.group());
			
		}
	}
}

package com.lqx;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Lqx1320Regex {
	public static void main(String[] args) {
//		ʹ��������ʽ����������������Ƿ�ϸ�
//		����Ҫ 6 λ,ֻ�������ֻ���ĸ���
//		ʹ��������ʽ����ɷָ�滻����ȡ����
//		�ֱ�дһ��ʾ��
		String regex = "[\\da-zA-Z]{6}";
		String passWord = "524s54";
		String passWord1 = "5_4s54";
		System.out.println(passWord.matches(regex));
		System.out.println(passWord1.matches(regex));
		//�ָ�
		String str1="��ϼ/�����/���/��ˮ/������/һɫ";
		String[] strs = str1.split("/");
		System.out.println(Arrays.toString(strs));
		//�滻
		str1="you tel 18954585458 my tel 15652528458";
		System.out.println(str1.replaceAll("[1][3,4,5,7,8][0-9]{9}","****"));
		//��ȡ
		regex = "[1][3,4,5,7,8][0-9]{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str1);
		while (m.find()) {
			System.out.println(m.group());
			
		}
	}
}

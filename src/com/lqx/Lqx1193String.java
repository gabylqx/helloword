package com.lqx;

public class Lqx1193String {
	public static void main(String[] args) {
//		ʹ�� 3 �ֹ��췽����ʵ�����ַ���
		String s = new String("vae");
		char a[] = new char[] {'a','b','c','d','f'};
		String s1 = new String(a);
		String s2 = new String(a,0,3);
		System.out.println(s+s1+s2);
//		���һ���ַ����Ƿ���"abc"��ͷ
		System.out.println(s1.startsWith("abc"));
//		���һ���ַ����Ƿ��� xyz ��β
		System.out.println(s2.endsWith("xyz"));
//		��У cde �� fgh �Ĵ�С
		System.out.println("cde".compareTo("fgh"));
//		���ִ�Сд�ıȽ� xyz �� abc �Ĵ�С
		System.out.println("xyz".compareToIgnoreCase("abc"));
//		���һ���ַ����Ƿ��� df ������
		System.out.println(s1.concat("df"));
//		���"jhg"�ڡ�abcdefghjhgijklmn���е�����λ��
		String s4 = "abcdefghjhgijklmn";
		System.out.println(s4.indexOf("jhg"));
//		���"jhg"�ڡ�abcdefghjhgijklmjhgn���еĴӵ� 12 ���ַ���ʼ��������λ��
		System.out.println("abcdefghjhgijklmjhgn".indexOf("jhg", 12));
//		���"ihj"��ĳ����abcdefghjhjijklihjmihjn�������ֵ�λ��
//		ȡ��ĳһ���ַ����ӵ� 6 ���ַ���ʼ���Ӵ�
		System.out.println("sUCHSKXUCBDGCIShs".substring(6));
//		��ĳһ���ַ����ĵ� 3 �� 5 λ�������滻�� 123
		System.out.println("sUCHSKXUCBDGCIShs".replace("CHS", "123"));
//		�� how are your ?�Կո�Ϊ�ָ�����ת�����ַ�������
		String[] str = "how are your ?".split(" ");
		for(String ss:str) {
			System.out.println(ss);
		}
		
	}
}

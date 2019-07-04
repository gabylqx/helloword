package com.lqx;

import java.util.*;

public class Lqx1203Set {
	public static void main(String[] args) {
//		1.дһ�� Set ���ϣ����� 5 �� HashSet ��Ա
		Set s = new HashSet();
		s.add("1111");
		s.add("ggjda");
		s.add("ta,js");
		s.add("dagfafaf");
		s.add("sqdfgfds");
//		�� iteror ��ʾ������ע���Ƿ���˳���ŵ�,��ʾ�� hashCode ֵ
		Iterator iter = s.iterator();
		while(iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o);
		}
		System.out.println("--------------------");
//		ʹ�� remove �Ƴ���������Ȼ���� foreach ��ʾ����
		s.remove("1111");
		s.remove("sqdfgfds");
		for(Object o: s) {
			System.out.println(o);
		}
		System.out.println("--------------------");
//		������һЩ�ظ�ֵ��ʹ�� foreach ��ʾ������,r
		s.add("ggjda");
		s.add("ta,js");
		s.add("ta,js");
		s.add("dagfafaf");
		for(Object o: s) {
			System.out.println(o);
		}
		System.out.println("--------------------");
//		2. ���� TreeSet, ����һЩ double ���ݣ��������
		TreeSet s1 = new TreeSet();
		s1.add(8524.5);
		s1.add(4582.4);
		s1.add(6542.8);
		s1.add(9524.6);
//		Ȼ����ʾ������
		System.out.println(s1);
		System.out.println("--------------------");
//		ʹ�÷���:first(), last(),lower(),higher()
		System.out.println(s1.first());
		System.out.println(s1.last());
		System.out.println(s1.lower(8524.5));
		System.out.println(s1.higher(8524.5));
		System.out.println("--------------------");
//		ʹ�÷���:subSet(), headset(), tailSet()
		System.out.println(s1.subSet(6542.8, 9524.6));
		//��ȡ���������м������ ��ͷ����β
		System.out.println(s1.headSet(6542.8));
		System.out.println(s1.tailSet(6542.8));
		
	}
}

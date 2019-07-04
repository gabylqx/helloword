package com.lqx;

import java.util.*;

public class Lqx1203Set {
	public static void main(String[] args) {
//		1.写一个 Set 集合，放入 5 个 HashSet 成员
		Set s = new HashSet();
		s.add("1111");
		s.add("ggjda");
		s.add("ta,js");
		s.add("dagfafaf");
		s.add("sqdfgfds");
//		用 iteror 显示出来，注意是否是顺序存放的,显示其 hashCode 值
		Iterator iter = s.iterator();
		while(iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o);
		}
		System.out.println("--------------------");
//		使用 remove 移除几个对象，然后用 foreach 显示内容
		s.remove("1111");
		s.remove("sqdfgfds");
		for(Object o: s) {
			System.out.println(o);
		}
		System.out.println("--------------------");
//		再增加一些重复值，使用 foreach 显示其内容,r
		s.add("ggjda");
		s.add("ta,js");
		s.add("ta,js");
		s.add("dagfafaf");
		for(Object o: s) {
			System.out.println(o);
		}
		System.out.println("--------------------");
//		2. 定义 TreeSet, 加入一些 double 数据，乱序加入
		TreeSet s1 = new TreeSet();
		s1.add(8524.5);
		s1.add(4582.4);
		s1.add(6542.8);
		s1.add(9524.6);
//		然后显示其内容
		System.out.println(s1);
		System.out.println("--------------------");
//		使用方法:first(), last(),lower(),higher()
		System.out.println(s1.first());
		System.out.println(s1.last());
		System.out.println(s1.lower(8524.5));
		System.out.println(s1.higher(8524.5));
		System.out.println("--------------------");
//		使用方法:subSet(), headset(), tailSet()
		System.out.println(s1.subSet(6542.8, 9524.6));
		//截取两个数据中间的内容 含头不含尾
		System.out.println(s1.headSet(6542.8));
		System.out.println(s1.tailSet(6542.8));
		
	}
}

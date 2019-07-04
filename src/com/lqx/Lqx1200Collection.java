package com.lqx;
import java.util.*;

public class Lqx1200Collection {
	public static void main(String[] args) {
//		定义 Collection, 增加一些内容
		Collection c = new ArrayList();
		c.add(12);
		c.add("abc");
		c.add("sssss");
//		输出集合长度
		System.out.println(c.size());
		System.out.println("--------------------");
//		输出集合全部内容
		System.out.println(c);
		System.out.println("--------------------");
//		把集合转成数组，再输出内容
		Object[] obs = c.toArray();
		System.out.println(Arrays.toString(obs));
		System.out.println("--------------------");
//		把集合清空后，再检测否为空
		c.clear();
		System.out.println(c);
		System.out.println("--------------------");
//		重新新增一些内容，检查某一个内容是否在集合中
		c.add("a1a1");
		c.add(12);
		c.add("sssss");
		System.out.println(c.contains("a1a1"));
		System.out.println("--------------------");
//		再定义一个集合，把原来集合当中的内容加入新集合当中
		Collection c1 = new ArrayList();
		c1.addAll(c);
//		检查这二个集合内容是否相等
		System.out.println(c1.containsAll(c));
		System.out.println("--------------------");
//		写一个 collection 集合，使用 HashSet 放入 5 个成员
		Collection c2 = new ArrayList();
		HashSet names = new HashSet();
		names.add("abc");
		names.add("asd");
		names.add("ddd");
		names.add("cccc");
		names.add("ddd");
		c2.addAll(names);
//		分别用 iteror 显示
		Iterator iter = c2.iterator();
		while(iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o);
		}
		System.out.println("--------------------");
//		使用 remove 移除几个对象，然后用 foreach 显示内容
		c2.remove("ddd");
		c2.remove("asd");
		for(Object o:c2) {
			System.out.println(o);
		}
	}
}

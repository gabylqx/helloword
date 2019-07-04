package com.lqx.Lqx1215Collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.lqx.lqx;

public class Test {
	public static void main(String[] args) throws ParseException {
//		1. 定义 List, 加入一些数据,key 乱序方法
		List ls = new ArrayList();
//		使用 Collections 的各种方法，对 List 进行操作
		ls.add("851");
		ls.add("dvf");
		ls.add("ttt");
		ls.add("abc");
		ls.add("aaa");
		ls.add("ttt");
		System.out.println(ls);
		Collections.reverse(ls);//反转
		System.out.println(ls);
		Collections.shuffle(ls);//随机排序
		System.out.println(ls);
		Collections.sort(ls);//升序排序
		System.out.println(ls);
		Collections.swap(ls, 1, 3);;//元素换位
		System.out.println(ls);
		System.out.println(Collections.max(ls));//返回最大元素
		System.out.println(Collections.frequency(ls, "ttt"));//返回指定元素出现次数
		lqx.p();
//		2. 以泛型方法定义一个 list
		List<Date> ls1 = new ArrayList<Date>();
//		为其加入几个日期值，然后显示其内容
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		ls1.add(s.parse("2018-08-17  11:02:23"));
		ls1.add(s.parse("2014-05-17  16:29:40"));
		ls1.add(s.parse("2008-12-17  12:52:25"));
		ls1.add(s.parse("2019-09-17  08:32:30"));
		for(Object o:ls1) {
			System.out.println(o);
		}
		lqx.p();
		Collections.shuffle(ls1);
		for(Object o:ls1) {
			System.out.println(o);
		}
		lqx.p();
//		3. 在一个 Set 中增加一些 Dog,然后显示全部内容
		Set<Dog> set = new HashSet<Dog>();
		set.add(new Dog("小白",5));
		set.add(new Dog("小粉",8));
		set.add(new Dog("小绿",2));
		set.add(new Dog("小黄",3));
		for(Dog o : set) {
			System.out.println(o);
		}
		lqx.p();
//		4. 在一个 Map 中增加一些职员 Clerk,然后显示全部内容
		Map map = new HashMap();
		map.put(1,new Clerk());
		map.put(2,new Clerk(1,"刘江河",4500.));
		map.put(3,new Clerk(2,"刘江河",8000.));
		map.put(4,new Clerk(3,"刘江河",6000.));
		Set set1  = map.keySet();
		for(Object oj:set1) {
			System.out.println(oj+"/"+map.get(oj));
		}
	}
}
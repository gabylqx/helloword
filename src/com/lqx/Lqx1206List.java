package com.lqx;

import java.util.*;

public class Lqx1206List {
	public static void main(String[] args) {
//		定义 List, 加入一些自定义类
		List l = new ArrayList();
		l.add("sfdsd");
		l.add("fsd");
		l.add("ht");
		l.add("rtjr");
		l.add("rtyd");
//		1. 然后显示其内容
		System.out.println(l);
		System.out.println("---------------------");
//		2. 使用 ListIterator 的 next 方式，显示全部内容
		ListIterator lt = l.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		System.out.println("---------------------");
//		3. 使用 ListIterator 的 previous 方式，显示全部内容
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}
	}
}

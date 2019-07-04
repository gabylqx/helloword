package com.lqxLqx1209ListWild;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<Goods> ls = new ArrayList<Goods>();
		ls.add(new Goods("饼干","0856",445.0));
		ls.add(new Goods("豆干","0986",955.0));
		ls.add(new Goods("香干","0896",251.0));
		ls.add(new Goods("酱干","0656",824.0));
		for(Goods g:ls) {
			System.out.println(g);
		}
	}
}

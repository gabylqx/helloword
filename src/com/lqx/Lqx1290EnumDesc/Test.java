package com.lqx.Lqx1290EnumDesc;

import com.lqx.lqx;

public class Test {
	public static void main(String[] args) {
		Colour a = Colour.red;
		System.out.println(a);
		Colour a1 = Colour.valueOf("oliveGreen");
		System.out.println(a.equals(a1));
		System.out.println(a1.ordinal());
		System.out.println(a.getClass());
		System.out.println(a.compareTo(a1));
		System.out.println(a.name());
		lqx.p();
		for (Colour c:Colour.values()) {
			System.out.print(c);
			System.out.println(c.getDesc());
		}
	}
}

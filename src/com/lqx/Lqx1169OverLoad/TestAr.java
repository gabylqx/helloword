package com.lqx.Lqx1169OverLoad;

public class TestAr {
	public static void main(String[] args) {
//		测试类中，实例化子类cat，调用子类的方法ccaca，再调用父类的属性Name，且被改写方法call	
		Cat c1 = new Cat();
		c1.ccaca();
		c1.setName("傻");
		c1.call();
		
//		使用三个构造方法，实例化三个对象
		EatJ a = new EatJ();
		EatJ b = new EatJ(12);
		EatJ c = new EatJ(151,4);
	}
}

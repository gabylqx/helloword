package com.lqx.Lqx1178BookFactory;

public class test {
	public static void main(String[] args) {
		BookFactory a = BookFactory.getBookFactory();
		BookFactory b = BookFactory.getBookFactory();

		a.setFactoryName("С��");
		a.setFactoryArea(15500);
		a.setFactoryOffer(1000);
		System.out.println(a.toString());

		b.setFactoryName("��");
		b.setFactoryArea(5555500);
		b.setFactoryOffer(55000);
		System.out.println(a.toString());

		System.out.println(b.toString());
	}
}

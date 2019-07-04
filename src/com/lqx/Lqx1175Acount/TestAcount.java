package com.lqx.Lqx1175Acount;

public class TestAcount {
	public static void main(String[] args) {
		Acount a1 = new Acount();
		Acount a2 = new Acount();
		Acount a3 = new Acount();
		a1.setAll("6005", "852491", 1750.2);
		a2.setAll("6008", "345685", 3750.5);
		a3.setAll("6025", "282533", 50.6);
		a1.syso();
		a2.syso();
		a3.syso();
	}
}

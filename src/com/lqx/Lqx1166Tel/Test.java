package com.lqx.Lqx1166Tel;

public class Test {
	public static void main(String[] args) {
		Tel t1 = new Mobile();
		t1.setTelBr("Åµ»ùÑÇ");
		t1.Call();
		s();
		t1.Msg();
		s();
		Mobile m1 = null;
		Mobile m2 = new Mobile();
		if(t1 instanceof Mobile) {
			m1 = (Mobile)t1;
		}
		m1.Game();
		s();
		m2.Game();
	}
	public static void s(){
		System.out.println("--------------------------");
	}
}

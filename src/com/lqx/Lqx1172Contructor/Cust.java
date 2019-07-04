package com.lqx.Lqx1172Contructor;

public class Cust {

	private String name;
	private int peoNum;

	public Cust(String name, int peoNum) {
		this.name = name;
		this.peoNum = peoNum;
	}

	public Cust(int peoNum) {
		
		this(null,peoNum);
	}

	public Cust(String name) {
		this(name,0);
	}
	public Cust() {
		this("ио");
	}

}
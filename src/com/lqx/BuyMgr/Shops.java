package com.lqx.BuyMgr;

import java.io.Serializable;


public class Shops implements Serializable {
	private String no;
	private String name;
	
	@Override
	public String toString() {
		return "Goods [no=" + no + ", name=" + name + "]";
	}

	public Shops(String no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}

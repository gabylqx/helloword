package com.lqx.BuyMgr;

import java.io.Serializable;


public class Goods implements Serializable {
	private String no;
	private String name;
	private Double pr;
	
	@Override
	public String toString() {
		return "Goods [no=" + no + ", name=" + name + ", pr=" + pr + "]";
	}

	public Goods(String no, String name, Double pr) {
		super();
		this.no = no;
		this.name = name;
		this.pr = pr;
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

	public Double getPr() {
		return pr;
	}

	public void setPr(Double pr) {
		this.pr = pr;
	}
	
	
}

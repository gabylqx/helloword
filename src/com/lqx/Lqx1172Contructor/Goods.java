package com.lqx.Lqx1172Contructor;

public class Goods {
	private int goodsId;
	private String goodsName;
	private int goodsPr;
	
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsPr() {
		return goodsPr;
	}
	public void setGoodsPr(int goodsPr) {
		if(goodsPr>=0) {
			this.goodsPr = goodsPr;
		}
		else {
			System.out.println("不能小于0");
		}
	}
	

	

	
	public Goods(int a,String b,int c) {
		this.goodsId = a;
		this.goodsName = b;
		if(c>=0) {
			this.goodsPr = c;
		}
		else {
			System.out.println("价格不能小于0");
		}
	}
	
	public Goods(int a,String b) {
		this.goodsId = a;
		this.goodsName = b;
	}
	
	public Goods(int a) {
		this(a,"snkjAS");
	}
	
	public Goods() {
		
	}
}

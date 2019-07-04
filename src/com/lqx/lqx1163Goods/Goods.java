package com.lqx.lqx1163Goods;

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
}

package com.lqxLqx1209ListWild;

public class Goods {
	private Integer id;
	private String name;
	private String no;
	private Double pr;
	
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", no=" + no + ", pr=" + pr + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Double getPr() {
		return pr;
	}

	public void setPr(Double pr) {
		this.pr = pr;
	}

	public Goods(String name, String no, Double pr) {
		this.name = name;
		this.no = no;
		this.pr = pr;
	}

	public Goods() {
	}
	
}

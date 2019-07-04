package com.lqx.Lqx1215Collections;

public class Clerk {
//	职员类 Clerk类(编号，姓名，工资
	private Integer id;
	private String name;
	private Double wage;
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
	public Double getWage() {
		return wage;
	}
	public void setWage(Double wage) {
		this.wage = wage;
	}
	public Clerk(Integer id, String name, Double wage) {
		this.id = id;
		this.name = name;
		this.wage = wage;
	}
	@Override
	public String toString() {
		return "Clerk [id=" + id + ", name=" + name + ", wage=" + wage + "]";
	}
	public Clerk() {
	}
	
}

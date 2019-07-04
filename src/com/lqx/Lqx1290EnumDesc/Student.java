package com.lqx.Lqx1290EnumDesc;

public enum Student {
	pupil("小学生"),
	undergraduateStudent("大学生"),
	graduateStudent("研究生");
	private String desc;
	private String name;
	private Student(String desc) {
		this.setDesc(desc);
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Student:"+this.name()+"  id:"+this.ordinal()+"  desc:"+this.getDesc();
		
	}
}

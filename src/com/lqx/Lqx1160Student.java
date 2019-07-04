package com.lqx;

public class Lqx1160Student {
	
	public String studentName;//共有
	protected long studentId;//保护
	byte studentAge;
	private String studentEdu;//私有
	
	//无参公有方法，返回学生的学校
	public String getStudentEdu() {
		return studentEdu;
	}
	
	//无参私有方法，无返回值
	//打印学生的信息，包括名称，编号，年龄,学校
	private void printall() {
		System.out.println(this.studentName);
		System.out.println(this.studentId);
		System.out.println(this.studentAge);
		System.out.println(this.studentEdu);
	}
	
	public void printlnall() {
		System.out.print(this.studentName+" ");
		System.out.print(this.studentId+" ");
		System.out.print(this.studentAge+" ");
		System.out.println(this.studentEdu+" ");
	}
	
	//定义一个有参公有方法，用于设置学生的所在学校信息，无返回值
	public void setStudentIfo(String studentName,long studentId,byte studentAge,String studentEdu) {
		this.studentEdu = studentEdu;
		this.studentAge = studentAge;
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	
}

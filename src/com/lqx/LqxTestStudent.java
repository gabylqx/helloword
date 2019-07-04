package com.lqx;

public class LqxTestStudent {
	public static void main(String[] args) {
		
		Lqx1160Student s1 = new Lqx1160Student();
		Lqx1160Student s2 = new Lqx1160Student();
		Lqx1160Student s3 = new Lqx1160Student();
		Lqx1160Student s4 = new Lqx1160Student();
		Lqx1160Student s5 = new Lqx1160Student();
		Lqx1160Student s6 = new Lqx1160Student();
		
		s1.setStudentIfo("周杰伦",258L,(byte) 43,"南开大学");
		s2.setStudentIfo("蔡依林",259L,(byte) 33,"复旦大学");
		s3.setStudentIfo("贾宝玉",260L,(byte) 48,"清华大学");
		
		s1.printlnall();
		s2.printlnall();
		s3.printlnall();
		s4.printlnall();
		s5.printlnall();
		s6.printlnall();
	}
}

package com.lqx.Lqx1290EnumDesc;

import com.lqx.lqx;

public class TestSud {
	public static void main(String[] args) {
		for (Student s:Student.values()) {
			System.out.println(s);
		}
		lqx.p();
		Student[] stus = {Student.graduateStudent,Student.pupil,Student.undergraduateStudent} ;
		stus[0].setName("С��");
		stus[1].setName("С��");
		stus[2].setName("С��");
		System.out.println(stus[0]+"  name:"+stus[0].getName());
		System.out.println(stus[1]+"  name:"+stus[1].getName());
		System.out.println(stus[2]+"  name:"+stus[2].getName());
		
	}
}

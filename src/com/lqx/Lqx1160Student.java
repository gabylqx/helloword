package com.lqx;

public class Lqx1160Student {
	
	public String studentName;//����
	protected long studentId;//����
	byte studentAge;
	private String studentEdu;//˽��
	
	//�޲ι��з���������ѧ����ѧУ
	public String getStudentEdu() {
		return studentEdu;
	}
	
	//�޲�˽�з������޷���ֵ
	//��ӡѧ������Ϣ���������ƣ���ţ�����,ѧУ
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
	
	//����һ���вι��з�������������ѧ��������ѧУ��Ϣ���޷���ֵ
	public void setStudentIfo(String studentName,long studentId,byte studentAge,String studentEdu) {
		this.studentEdu = studentEdu;
		this.studentAge = studentAge;
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	
}

package com.lqx.ex;

public class Lqx1253ExceptionDeclare extends RuntimeException {
//	����һ������
//	�Ӽ����ж���һ���ַ�
//	����������ݲ��� 26 ����ĸ�����׳������ XXX ���ݲ��� 26 ����ĸ
//	���������е�������������������׳����쳣
	private int id;

	public Lqx1253ExceptionDeclare(String msg, int id) {
		super(msg);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

package com.lqx.ex;

public class Lqx1253ExceptionDeclare extends RuntimeException {
//	定义一个函数
//	从键盘中读入一个字符
//	果输入的内容不是 26 个字母，则抛出输入的 XXX 内容不是 26 个字母
//	在主方法中调用这个函数，并处理抛出的异常
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

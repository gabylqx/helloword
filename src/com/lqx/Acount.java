package com.lqx;

public class Acount {
	//���ʺš��������롱����������������ʡ�������С��
	private String account;
	private String password;
	private double balance;
	static double interest;
	static double minimum;
	
	static {
		//����������
		interest = 0.0003;
		//��С���0
		minimum = 0;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}

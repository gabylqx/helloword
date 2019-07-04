package com.lqx.Lqx1175Acount;
public class Acount {
	// “帐号”、“密码”、“存款余额”、“利率”、“最小余额”
	private String account;
	private String password;
	private double balance;
	static double interest;
	static double minimum;

	static {
		// 年利率万三
		interest = 0.0003;
		// 最小余额0
		minimum = 0;
	}

	public void setAll(String account, String password, double balance) {
		this.account = account;
		this.password = password;
		this.balance = balance;
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

	public void syso() {
		System.out.println("account:" + account);
		System.out.println("password:" + password);
		System.out.println("balance:" + balance);
		System.out.println("interest:" + interest);
		System.out.println("minimum:" + minimum);
		System.out.println("------------------");
	}

}

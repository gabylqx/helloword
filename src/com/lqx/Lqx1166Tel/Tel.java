package com.lqx.Lqx1166Tel;

public class Tel {
	protected int telNum;
	protected String telBr;
	
	public int getTelNum() {
		return telNum;
	}
	public void setTelNum(int telNum) {
		this.telNum = telNum;
	}
	public String getTelBr() {
		return telBr;
	}
	public void setTelBr(String telBr) {
		this.telBr = telBr;
	}
	protected void Call() {
		System.out.println(this.telBr + "���˸��绰");
	}
	protected void Msg() {
		System.out.println("�̶��绰���ܷ�����");
	}
}

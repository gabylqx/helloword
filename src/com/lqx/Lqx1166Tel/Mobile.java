package com.lqx.Lqx1166Tel;

public class Mobile extends Tel {
	private double mobSize;
	private String mobGpu;
	private String mobCpu;
	private String mobRomSize;
	public int a;
	
	public void Call() {
		System.out.println(this.getTelBr() + "����һ��4G����绰");
	}
	
	public void Msg(){
		System.out.println(this.getTelBr() + "����һ��������Ϣ");
	}
	
	public void Game() {
		System.out.println(this.getTelBr()+"����������ҫ�С�����������");
		System.out.println("�ٻ�ʦ��ϵͳ��⵽�����ڲ�������Ϸ��Ϊ�������˺��ѱ���ͣ����9021����¼");
		System.out.println("������ҫ���˳�");
	}
}

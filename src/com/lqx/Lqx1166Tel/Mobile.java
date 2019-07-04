package com.lqx.Lqx1166Tel;

public class Mobile extends Tel {
	private double mobSize;
	private String mobGpu;
	private String mobCpu;
	private String mobRomSize;
	public int a;
	
	public void Call() {
		System.out.println(this.getTelBr() + "打了一个4G网络电话");
	}
	
	public void Msg(){
		System.out.println(this.getTelBr() + "发了一条网络信息");
	}
	
	public void Game() {
		System.out.println(this.getTelBr()+"启动王者荣耀中。。。。。。");
		System.out.println("召唤师，系统检测到您存在不良的游戏行为，您的账号已被封停，请9021年后登录");
		System.out.println("王者荣耀已退出");
	}
}

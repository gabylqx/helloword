package com.lqx.Lqx1169OverLoad;

public class Ar {
	public int Max(int a,int b){
		return a>b?a:b;
	}
	public double Max(double a,double b){
		return a>b?a:b;
	}
	public double Max(double a,double b,double c){
		return (a>b?a:b)>c?(a>b?a:b):c;
	}
}

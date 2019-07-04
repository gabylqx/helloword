package com.lqx.Lqx1181Animal;

public class Robot implements Jumpable,Digable, Swimable, Flyable{
	private String name;
	


	@Override
	public void swim() {
		System.out.println(this.name+ "在游");
		
	}

	@Override
	public void jump() {
		System.out.println(this.name+ "在跳");
		
	}

	@Override
	public void digable() {
		System.out.println(this.name+ "在挖");
		
	}
	
	@Override
	public void flying() {

		System.out.println(this.name+ "在飞");
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}

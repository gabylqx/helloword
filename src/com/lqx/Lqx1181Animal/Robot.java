package com.lqx.Lqx1181Animal;

public class Robot implements Jumpable,Digable, Swimable, Flyable{
	private String name;
	


	@Override
	public void swim() {
		System.out.println(this.name+ "����");
		
	}

	@Override
	public void jump() {
		System.out.println(this.name+ "����");
		
	}

	@Override
	public void digable() {
		System.out.println(this.name+ "����");
		
	}
	
	@Override
	public void flying() {

		System.out.println(this.name+ "�ڷ�");
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}

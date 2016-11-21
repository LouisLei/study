package com.lakala.work.design.clone;

import java.io.Serializable;

public class Professor implements Cloneable,Serializable {

	private static final long serialVersionUID = 1L;
	
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Professor(){
		
	}
	
	public Professor(int age, String name) {
		this.age = age;
		this.name = name;
	}
	

}

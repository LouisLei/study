package com.lakala.work.design.build;

/**
 *构造者模式
 */
public class Person {

	private int age;
	private int safeId;
	private String name;
	private String address;

	public int getAge() {
		return age;
	}

	public int getSafeId() {
		return safeId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public static class Builder{
		private int age = 0;
		private int safeId = 0;
		private String name = null;
		private String address = null;
		
		public Builder(String name){
			this.name = name;
		}
		
		public Builder age (int value){
			age = value;
			return this;
		}
		
		public Builder safeId (int value){
			safeId = value;
			return this;
		}
		
		public Builder address (String value){
			address = value;
			return this;
		}
		
		public Person build(){
			return new Person(this);
		} 
		
	}
	
	private Person (Builder build){
		age = build.age;
		safeId = build.safeId;
		name = build.name;
		address = build.address;
	}

}

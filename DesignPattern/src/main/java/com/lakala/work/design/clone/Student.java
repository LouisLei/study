package com.lakala.work.design.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Cloneable,Serializable {

	private static final long serialVersionUID = 1L;
	
	private int age;
	private String name;
	private Professor professor;

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

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	/**
	 * 浅克隆
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	/**
	 * 深克隆
	 * @return
	 */
	public Object deepClone(){
		Object obj = null;
		try {
			//将对象写入流中
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bao);
			oos.writeObject(this);
			
			ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bai);
			obj = ois.readObject();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public Student() {

	}

	public Student(int age, String name, Professor professor) {
		this.age = age;
		this.name = name;
		this.professor = professor;
	}
	
	

}

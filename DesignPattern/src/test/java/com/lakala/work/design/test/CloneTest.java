package com.lakala.work.design.test;

import org.junit.Test;

import com.lakala.work.design.clone.Professor;
import com.lakala.work.design.clone.Student;

public class CloneTest {
	
	/**
	 * 浅层克隆
	 * 只会克隆类中的基本数据类型，对于引用不会改变，还是指向之前的引用类，所以一旦你改变克隆类中的包括的引用类
	 * 属性值，不仅仅会改变克隆类中的引用类数据，还会改变之前的数据
	 * 下面的demo会发现age都变成了10
	 * @throws CloneNotSupportedException
	 */
	@Test
	public void testClone() throws CloneNotSupportedException{
		Professor p = new Professor(50, "Leon");
		Student s = new Student(20, "Jack",p);
		Student nStu = (Student)s.clone();
		nStu.getProfessor().setAge(10);
		System.out.println("学生类中的professor age : " + nStu.getProfessor().getAge());
		System.out.println("专家类中的age : " + p.getAge());
	}
	
	/**
	 * 深克隆
	 * 下面的demo发现只会修改克隆类里面的引用的age，不会对原来的professor 中的age改变
	 */
	@Test
	public void testDeepClone () {
		Professor p = new Professor(50, "Leon");
		Student s = new Student(20, "Jack",p);
		Student nStu = (Student)s.deepClone();
		nStu.getProfessor().setAge(10);
		System.out.println("学生类中的professor age : " + nStu.getProfessor().getAge());
		System.out.println("专家类中的age : " + p.getAge());
	}

}

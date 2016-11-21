package com.lakala.work.design.test;

import org.junit.Test;

import com.lakala.work.design.clone.Professor;
import com.lakala.work.design.clone.Student;

public class CloneTest {
	
	/**
	 * ǳ���¡
	 * ֻ���¡���еĻ����������ͣ��������ò���ı䣬����ָ��֮ǰ�������࣬����һ����ı��¡���еİ�����������
	 * ����ֵ����������ı��¡���е����������ݣ�����ı�֮ǰ������
	 * �����demo�ᷢ��age�������10
	 * @throws CloneNotSupportedException
	 */
	@Test
	public void testClone() throws CloneNotSupportedException{
		Professor p = new Professor(50, "Leon");
		Student s = new Student(20, "Jack",p);
		Student nStu = (Student)s.clone();
		nStu.getProfessor().setAge(10);
		System.out.println("ѧ�����е�professor age : " + nStu.getProfessor().getAge());
		System.out.println("ר�����е�age : " + p.getAge());
	}
	
	/**
	 * ���¡
	 * �����demo����ֻ���޸Ŀ�¡����������õ�age�������ԭ����professor �е�age�ı�
	 */
	@Test
	public void testDeepClone () {
		Professor p = new Professor(50, "Leon");
		Student s = new Student(20, "Jack",p);
		Student nStu = (Student)s.deepClone();
		nStu.getProfessor().setAge(10);
		System.out.println("ѧ�����е�professor age : " + nStu.getProfessor().getAge());
		System.out.println("ר�����е�age : " + p.getAge());
	}

}

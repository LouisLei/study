package com.lakala.work.design.sington;

import java.util.Vector;

/**
 * ����ģʽ
 */
public class Singleton {

	private static Singleton instance = null;
	private Vector<Object> properties = null;

	public Singleton() {

	}

	private synchronized static void init() {
		if (instance == null) {
			System.out.println("start init singleton instance");
			instance = new Singleton();
			System.out.println("get singleton instance : " + instance);
		}
	}

	public static Singleton getInstance() {
		if (instance == null) {
			init();
		}
		return instance;
	}

	/* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
	public Object readObject() {
		return instance;
	}

	public void updateProperties() {
		Singleton singleton = new Singleton();
		singleton.getProperties();
	}

	private Vector<Object> getProperties() {
		return properties;
	}

}

package com.lakala.work.design.test;

import org.junit.Test;

import com.lakala.work.design.adapter.ClassAdapter;
import com.lakala.work.design.adapter.InterfaceAdapter;
import com.lakala.work.design.adapter.ObjectAdapter;
import com.lakala.work.design.adapter.SourceClass;
import com.lakala.work.design.adapter.TargetClass;

public class AdapterTest {

	/**
	 * 类适配器
	 */
	@Test
	public void testClassAdapter() {
		TargetClass target = new ClassAdapter();
		target.method1();
		target.method2();
	}
	
	/**
	 * 对象适配器
	 */
	@Test
	public void testObjectAdapter(){
		SourceClass source = new SourceClass();
		TargetClass t = new ObjectAdapter(source);
		t.method1();
		t.method2();
	}
	
	/**
	 * 接口适配器
	 */
	@Test
	public void testInterfaceAdapter(){
		InterfaceAdapter ia = new InterfaceAdapter();
		ia.method1();
		//ia.method2();
	}

}

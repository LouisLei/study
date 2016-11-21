package com.lakala.work.design.adapter;

/**
 * 接口适配器 很多情况下我们会在一个接口中定义很多方法，但是在后续的实现的时候可能并不需要在一个实现类中实现所有的方法，
 * 这样的情况下我们会用抽象类来把接口封装一层，这样在后续的实现的时候不需要去修改接口类，直接实现抽象类即可达到要求
 */
public abstract class InterfaceWrap implements TargetClass {

	public void method1() {

	}

	public void method2() {

	}

}

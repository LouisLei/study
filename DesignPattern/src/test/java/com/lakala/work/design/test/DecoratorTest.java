package com.lakala.work.design.test;

import org.junit.Test;

import com.lakala.work.design.decorator.Dog;
import com.lakala.work.design.decorator.Owner;

/**
 *装饰者模式
 *对已有的对象进行另外的修饰
 */
public class DecoratorTest {
	
	@Test
	public void testDecorator(){
		Dog dog = new Dog();
		Owner owner = new Owner(dog);
		owner.sayHello();
	}

}

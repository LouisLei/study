package com.lakala.work.design.test;

import org.junit.Test;

import com.lakala.work.design.decorator.Dog;
import com.lakala.work.design.decorator.Owner;

/**
 *װ����ģʽ
 *�����еĶ���������������
 */
public class DecoratorTest {
	
	@Test
	public void testDecorator(){
		Dog dog = new Dog();
		Owner owner = new Owner(dog);
		owner.sayHello();
	}

}

package com.lakala.work.design.test;

import org.junit.Test;

import com.lakala.work.design.build.Person;

public class BuilderTest {
	
	@Test
	public void testBuilder (){
		Person person = new Person.Builder("Jack").age(20).safeId(2345).address("USA")
				.build();
		System.out.println(person.getName());
	}

}

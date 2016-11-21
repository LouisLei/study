package com.lakala.work.design.test;

import org.junit.Test;

import com.lakala.work.design.sington.Singleton;

public class SingletonTest {
	
	/**
	 * ²âÊÔµ¥ÀıÄ£Ê½
	 */
	@Test
	public void testSingleton(){
		Singleton instance = Singleton.getInstance();
		instance.hashCode();
	}

}

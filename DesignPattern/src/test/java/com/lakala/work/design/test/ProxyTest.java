package com.lakala.work.design.test;

import org.junit.Test;

import com.lakala.work.design.proxy.Boss;
import com.lakala.work.design.proxy.Secretary;

/**
 *代理模式
 */
public class ProxyTest {
	
	@Test
	public void testProxy(){
		
		Boss boss = new Boss();
		Secretary s = new Secretary(boss);
		s.meeting();
		
	}

}

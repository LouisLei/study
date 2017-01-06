package com.lakala.ipos.report.springAop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lakala.ipos.report.springAop.service.UserManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context/application-config-anotation.xml")
public class AopAnoTest {

	@Autowired
	private UserManager userManager;

	@Test
	public void test() {
		userManager.findUserById(1);

		System.out.println("=====我==是==分==割==线=====");
		try {
			// 查不到数据，会抛异常，异常会被AfterThrowingAdvice捕获
			userManager.findUserById(0);
		} catch (IllegalArgumentException e) {
		}
	}

}

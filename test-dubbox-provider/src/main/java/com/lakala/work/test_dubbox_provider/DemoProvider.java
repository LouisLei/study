package com.lakala.work.test_dubbox_provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoProvider {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath*:*.xml");
		context.start();
		System.out.println("服务已经启动...");
		System.in.read();
	}
}

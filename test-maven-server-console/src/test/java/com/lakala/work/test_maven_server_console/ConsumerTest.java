package com.lakala.work.test_maven_server_console;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo_consumer.xml");
    	context.start();
    	IndexController indexController = (IndexController) context.getBean("indexController");
    	indexController.index();
        try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

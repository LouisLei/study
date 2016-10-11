package com.lakala.work.SpringDubboTest;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo.xml");
    	context.start();
        try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}

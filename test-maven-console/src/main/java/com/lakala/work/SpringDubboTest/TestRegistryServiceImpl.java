package com.lakala.work.SpringDubboTest;

import org.springframework.stereotype.Service;

@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService {

	public String hello(String name) {

		return "hello" + name;
	}

}

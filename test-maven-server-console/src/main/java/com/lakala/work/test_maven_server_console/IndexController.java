package com.lakala.work.test_maven_server_console;

import com.lakala.work.SpringDubboTest.TestRegistryService;

public class IndexController {

	private TestRegistryService testRegistryService;

	public String index() {
		String name = testRegistryService.hello("Lei");
		System.out.println("test output : " + name);
		return name;
	}

	public TestRegistryService getTestRegistryService() {
		return testRegistryService;
	}

	public void setTestRegistryService(TestRegistryService testRegistryService) {
		this.testRegistryService = testRegistryService;
	}

}

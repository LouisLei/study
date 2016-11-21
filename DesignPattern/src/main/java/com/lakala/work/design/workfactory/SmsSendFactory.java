package com.lakala.work.design.workfactory;

public class SmsSendFactory implements Provider {

	@Override
	public SmsSend provider() {
		return new SmsSend();
	}

}

package com.lakala.work.design.workfactory;

public class SmsSend implements Send {

	@Override
	public void send() {
		System.out.println("This is the sms send ... ");
	}

}

package com.lakala.work.design.workfactory;

public class EmailSend implements Send {

	@Override
	public void send() {
		System.out.println("This is the email send ... ");
	}

}

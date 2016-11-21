package com.lakala.work.design.workfactory;

public class EmailSendFactory implements Provider {

	@Override
	public EmailSend provider() {
		return new EmailSend();
	}

}

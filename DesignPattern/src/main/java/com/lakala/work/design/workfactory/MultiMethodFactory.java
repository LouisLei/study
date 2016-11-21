package com.lakala.work.design.workfactory;

public class MultiMethodFactory {

	public EmailSend emailSend() {
		return new EmailSend();
	}

	public SmsSend smsSend() {
		return new SmsSend();
	}

}

package com.lakala.work.design.workfactory;

public class NormalSendFactory {

	public Send send(String type) {
		if (type.equalsIgnoreCase("email")) {
			return new EmailSend();
		} else if (type.equalsIgnoreCase("sms")) {
			return new SmsSend();
		} else {
			System.out.println("Cannot recongnize this type : " + type);
			return null;
		}
	}

}

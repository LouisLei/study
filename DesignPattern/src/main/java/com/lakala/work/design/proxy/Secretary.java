package com.lakala.work.design.proxy;

public class Secretary implements Meeting{
	
	private Meeting meeting ;
	
	@Override
	public void meeting() {
		System.out.println("����ǰԤ�ȶ������� ...");
		meeting.meeting();
		System.out.println("�������Ҫ������������ ... ");
	}
	
	public Secretary(Meeting meeting){
		this.meeting = meeting;
	}

}

package com.lakala.work.design.proxy;

public class Secretary implements Meeting{
	
	private Meeting meeting ;
	
	@Override
	public void meeting() {
		System.out.println("开会前预先定会议室 ...");
		meeting.meeting();
		System.out.println("开会后需要将会议室清理 ... ");
	}
	
	public Secretary(Meeting meeting){
		this.meeting = meeting;
	}

}

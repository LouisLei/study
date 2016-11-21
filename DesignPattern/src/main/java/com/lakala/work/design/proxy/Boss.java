package com.lakala.work.design.proxy;

public class Boss implements Meeting{

	@Override
	public void meeting() {
		System.out.println("召开年度会议 ... ");
	}

}

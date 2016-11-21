package com.lakala.work.design.adapter;

public class ObjectAdapter implements TargetClass {

	private SourceClass sourceClass;

	@Override
	public void method1() {
		sourceClass.method1();
	}

	@Override
	public void method2() {
		System.out.println("This is the method2 ... ");
	}

	public SourceClass getSourceClass() {
		return sourceClass;
	}

	public void setSourceClass(SourceClass sourceClass) {
		this.sourceClass = sourceClass;
	}
	
	public ObjectAdapter(){
		
	}
	
	public ObjectAdapter(SourceClass sourceClass){
		this.sourceClass = sourceClass;
	}
	

}

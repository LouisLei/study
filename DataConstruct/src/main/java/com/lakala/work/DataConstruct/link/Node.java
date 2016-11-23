package com.lakala.work.DataConstruct.link;

public class Node {
	
	//index
	public Node next;
	
	//data
	public String data;
	
	public Node(String data){
		this.data = data;
	}
	
	public Node(){
		
	}
	
	
	public void display(){
		System.out.println("data is : " + data);
	}

}

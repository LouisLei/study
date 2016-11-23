package com.lakala.work.DataConstruct.dou.link;

/**
 * 双向链表
 * --->		<----
 * <---Node ----->
 */
public class Node {
	
	//index
	public Node next;
	public Node previous;
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

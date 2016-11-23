package com.lakala.work.DataConstruct.dou.link;

/**
 * 双向链表
 */
public class DoubleLink {

	// 头节点
	public Node head = new Node("Head");
	public int position = 0;
	public Node beforeNode;
	public Node currentNode;

	public Node addFirstNode(String data) {
		Node node = new Node(data);
		head.next = node;
		node.previous = head;
		return node;
	}

	public Node searchByPosition(int index) {
		Node node = head.next;
		if (node == null) {
			return null;
		}
		while (index != position) {
			node = node.next;
			position++;
		}
		position = 0;
		return node;
	}

	public Node addByPosition(int index, String data) {
		Node node = head.next;
		Node nNode = new Node(data);
		beforeNode = node;
		currentNode = node;
		if (node == null) {
			head.next = nNode;
			nNode.previous = head;
			return node;
		}

		while (position != index) {
			beforeNode = currentNode;
			currentNode = currentNode.next;
			position++;
		}
		
		beforeNode.next = nNode;
		nNode.next = currentNode;
		nNode.previous = beforeNode;
		if(currentNode != null){
			currentNode.previous = nNode;
		}
		position = 0;
		return nNode;
	}
	
	public Node addByData(String data){
		Node nNode = new Node(data);
		if(head.next == null){
			head.next = nNode;
			nNode.previous = head;
			return nNode;
		}
		Node node = head.next;
		while(node.next != null){
			node = node.next;
		}
		node.next = nNode;
		nNode.previous = node;
		return nNode;
	}
	
	public Node searchByData(String data){
		Node node = head.next;
		if(node == null){
			return null;
		}
		while(!node.data.equals(data)){
			node = node.next;
		}
		return node;
	}
	
	public Node deleteByPosition(int index){
		beforeNode = head.next;
		currentNode = head.next;
		while(index != position){
			beforeNode = currentNode;
			currentNode = currentNode.next;
			position++;
		}
		beforeNode.next = currentNode.next;
		currentNode.next.previous = beforeNode;
		position=0;
		return currentNode;
	}
	
	public Node deleteByData(String data){
		beforeNode = head.next;
		currentNode = head.next;
		while(!currentNode.data.equals(data)){
			beforeNode = currentNode;
			currentNode = currentNode.next;
			position++;
		}
		
		beforeNode.next = currentNode.next;
		currentNode.next.previous = beforeNode;
		position=0;
		return currentNode;
	}

}

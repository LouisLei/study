package com.lakala.work.DataConstruct.single.link;

public class LinkDemo {

	// head node
	public static Node head = new Node("Head");

	// node position
	public int position = 0;

	public Node previous;
	public Node current;

	public LinkDemo() {

	}

	/**
	 * head ----> Node ----> Node
	 * 
	 * @param data
	 */
	public void addFirstNode(String data) {
		Node node = new Node(data);
		head.next = node;

		// put the first node change to the current node
		// head = node;
	}

	public Node searchByPosition(int index) {
		Node node = head;
		while (position != index) {
			node = node.next;
			if (node == null) {
				return null;
			} else {
				position++;
			}
		}
		position = 0;
		return node;
	}

	public void addByPosition(int index, String data) {
		Node node = new Node(data);
		current = head;
		previous = head;
		while (index != position) {
			previous = current;
			current = current.next;
			position++;
		}
		previous.next = node;
		node.next = current;
		position = 0;
	}

	public void addByData(String data) {
		Node nNode = new Node(data);
		Node node = head.next;
		if (node != null) {
			while (node.next != null) {
				node = node.next;
			}
			node.next = nNode;
		} else {
			head.next = nNode;
		}

	}

	public Node searchByData(String data) {
		Node node = head.next;
		if (node == null) {
			return null;
		}

		while (node.data != data) {
			node = node.next;
		}
		return node;

	}

	public Node deleteByData(String data) {
		previous = head;
		current = head;
		if (current.next == null) {
			return null;
		}
		while (!current.data.equals(data)) {
			previous = current;
			current = current.next;
		}
		previous.next = current.next;
		return current;
	}

	/**
	 * delete first node and return this node
	 * 
	 */
	public Node deleteFirstNode() {
		Node node = head.next;
		if (node == null) {
			return null;
		}
		head.next = node.next;
		return node;
	}

}

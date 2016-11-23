package com.lakala.work.DataConstruct;

import org.junit.Test;

import com.lakala.work.DataConstruct.single.link.LinkDemo;

public class LinkDemoTest {
	
	@Test
	public void addFirstNode(){
		LinkDemo link = new LinkDemo();
		link.addFirstNode("111");
		System.out.println(link.searchByPosition(1).data);
	}
	
	@Test
	public void addByPositionTest(){
		LinkDemo link = new LinkDemo();
		link.addByPosition(1, "222");
		System.out.println(link.searchByPosition(1).data);
	}
	
	@Test
	public void addByDataTest(){
		LinkDemo link = new LinkDemo();
		link.addByData("222");
		link.addByData("333");
		link.addByData("444");
		System.out.println(link.searchByData("333").data);
	}
	
	@Test
	public void deleteFirstNodeTest(){
		LinkDemo link = new LinkDemo();
		link.addByData("222");
		link.addByData("333");
		link.addByData("444");
		System.out.println(link.deleteFirstNode().data);
		System.out.println(link.searchByPosition(1).data);
	}
	
	@Test
	public void deleteByDataTest(){
		LinkDemo link = new LinkDemo();
		link.addByData("222");
		link.addByData("333");
		link.addByData("444");
		System.out.println(link.deleteByData("333").data);
		System.out.println(link.searchByPosition(1).data);
		System.out.println(link.searchByPosition(2).data);
	}

}

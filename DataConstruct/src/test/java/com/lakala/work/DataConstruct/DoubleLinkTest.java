package com.lakala.work.DataConstruct;

import org.junit.Test;

import com.lakala.work.DataConstruct.dou.link.DoubleLink;

/**
 * 空节点在链表中不占position的位置 ，当你添加第一个节点的时候对应的position其实是0 而不是1
 */
public class DoubleLinkTest {

	@Test
	public void addFirstNode() {
		DoubleLink link = new DoubleLink();
		link.addFirstNode("111");
		System.out.println(link.searchByPosition(0).data);
	}
	
	@Test
	public void addByPositionTest(){
		DoubleLink link = new DoubleLink();
		link.addByPosition(0, "111");
		link.addByPosition(1, "222");
		link.addByPosition(2, "333");
		System.out.println(link.searchByPosition(1).data);
	}
	
	@Test
	public void addByDataTest(){
		DoubleLink link = new DoubleLink();
		link.addByPosition(0, "111");
		link.addByPosition(1, "222");
		link.addByPosition(2, "333");
		link.addByData("444");
		System.out.println(link.searchByPosition(3).data);
	}
	
	@Test
	public void searchByDataTest(){
		DoubleLink link = new DoubleLink();
		link.addByPosition(0, "111");
		link.addByPosition(1, "222");
		link.addByPosition(2, "333");
		link.addByData("444");
		System.out.println(link.searchByData("444").data);
	}
	
	@Test
	public void deleteByPositionTest(){
		DoubleLink link = new DoubleLink();
		link.addByPosition(0, "111");
		link.addByPosition(1, "222");
		link.addByPosition(2, "333");
		System.out.println(link.deleteByPosition(1).data);
		System.out.println(link.searchByPosition(0).data);
		System.out.println(link.searchByPosition(1).data);
	}
	
	@Test
	public void deleteByDataTest(){
		DoubleLink link = new DoubleLink();
		link.addByPosition(0, "111");
		link.addByPosition(1, "222");
		link.addByPosition(2, "333");
		System.out.println(link.deleteByData("222").data);
		System.out.println(link.searchByPosition(0).data);
		System.out.println(link.searchByPosition(1).data);
	}

}

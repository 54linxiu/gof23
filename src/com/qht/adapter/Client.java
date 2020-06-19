package com.qht.adapter;
/**
 * 客户端  相当于笔记本只有USB接口
 * @author q
 *
 */
public class Client {
	public void test1(Target t) {
		t.handleReq();
	}
	
	public static void main(String[] args) {
		Client c= new Client();
		Adaptee a = new Adaptee();
		
//		Target t = new Adapter();
		Target t = new Adapter2(a);
		c.test1(t);
	}
}

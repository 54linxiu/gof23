package com.qht.factory;

public class Client01 {
	public static void main(String[] args) {
		Car c1 = Simplefactory.getCar("°ÂµÏ");
		Car c2 = Simplefactory.getCar("±ÈÑÇµÏ");
		
		c1.run();
		c2.run();
	}
}

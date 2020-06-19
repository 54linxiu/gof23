package com.qht.bridge;
/**
 * 电脑类性能的维度
 * @author q
 *
 */
public class Computer {
	protected Brand brand;
	
	public  Computer(Brand b) {
		this.brand = b;
	}
	
	public  void sale() {
		brand.sale();
	}
	
}

class Desktop extends Computer{
	
	public Desktop(Brand b) {//实现子类 要先创建父类
		super(b);
	}
	
	public  void sale() {
		System.out.print("销售台式机");
		super.sale();
	}
}

class Laptop extends Computer{
	
	public Laptop(Brand b) {//实现子类 要先创建父类
		super(b);
	}
	
	public  void sale() {
		System.out.print("销售笔记本");
		super.sale();
	}
}
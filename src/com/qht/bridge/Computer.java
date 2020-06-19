package com.qht.bridge;
/**
 * ���������ܵ�ά��
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
	
	public Desktop(Brand b) {//ʵ������ Ҫ�ȴ�������
		super(b);
	}
	
	public  void sale() {
		System.out.print("����̨ʽ��");
		super.sale();
	}
}

class Laptop extends Computer{
	
	public Laptop(Brand b) {//ʵ������ Ҫ�ȴ�������
		super(b);
	}
	
	public  void sale() {
		System.out.print("���۱ʼǱ�");
		super.sale();
	}
}
package com.qht.templateMethod;

public class Client {
	public static void main(String[] args) {
		BankTemplateMethod b1 = new DrawMoney();
		b1.process();
		
		//匿名内部类
		BankTemplateMethod b2 = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("办理2000w理财");
			}
		};
		
		b2.process();
	}
	
}

class DrawMoney extends BankTemplateMethod{

	@Override
	public void transact() {
		System.out.println("我要取款");
	}
	
}

package com.qht.templateMethod;

public class Client {
	public static void main(String[] args) {
		BankTemplateMethod b1 = new DrawMoney();
		b1.process();
		
		//�����ڲ���
		BankTemplateMethod b2 = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("����2000w���");
			}
		};
		
		b2.process();
	}
	
}

class DrawMoney extends BankTemplateMethod{

	@Override
	public void transact() {
		System.out.println("��Ҫȡ��");
	}
	
}

package com.qht.proxy.staticProxy;

public class RealStar implements Star{

	@Override
	public void confer() {
		System.out.println("��̸");
		
	}

	@Override
	public void singContract() {
		System.out.println("ǩ��ͬ");		
	}

	@Override
	public void bookTicket() {
		System.out.println("��Ʊ");		
		
	}

	@Override
	public void sing() {
		System.out.println("���ֱ��� ����");
	}

	@Override
	public void collectMoney() {
		System.out.println("��Ǯ");
		
	}

}

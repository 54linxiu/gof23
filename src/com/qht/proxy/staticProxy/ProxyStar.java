package com.qht.proxy.staticProxy;

public class ProxyStar implements Star{
	private Star star;
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

	public ProxyStar(Star star) {
		this.star = star;
	}

	@Override
	public void sing() {
		star.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("��Ǯ");
		
	}


}

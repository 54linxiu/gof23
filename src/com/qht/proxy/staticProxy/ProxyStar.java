package com.qht.proxy.staticProxy;

public class ProxyStar implements Star{
	private Star star;
	@Override
	public void confer() {
		System.out.println("面谈");
		
	}

	@Override
	public void singContract() {
		System.out.println("签合同");		
	}

	@Override
	public void bookTicket() {
		System.out.println("订票");		
		
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
		System.out.println("收钱");
		
	}


}

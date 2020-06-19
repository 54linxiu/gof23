package com.qht.mediator;

public class Finacial implements Department{

	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.regeister("finacial", this);
	}

	private Mediator m;//持有中介者（总经理）的引用
	
	@Override
	public void selfAction() {
		System.out.println("数钱");
	}

	@Override
	public void outAction() {
		System.out.println("汇报钱多");
	}

}

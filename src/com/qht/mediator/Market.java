package com.qht.mediator;

public class Market implements Department{

	public Market(Mediator m) {
		super();
		this.m = m;
		m.regeister("market", this);
	}

	private Mediator m;//持有中介者（总经理）的引用
	
	@Override
	public void selfAction() {
		System.out.println("接项目");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作 项目进度 需要资金");
		m.command("finacial");
	}

}

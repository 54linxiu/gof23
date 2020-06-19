package com.qht.mediator;

public class Development implements Department{

	public Development(Mediator m) {
		super();
		this.m = m;
		m.regeister("development", this);
	}

	private Mediator m;//持有中介者（总经理）的引用
	
	@Override
	public void selfAction() {
		System.out.println("开发项目");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作没钱了 需要资金支持");
	}

}

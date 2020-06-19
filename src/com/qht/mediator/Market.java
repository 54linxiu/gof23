package com.qht.mediator;

public class Market implements Department{

	public Market(Mediator m) {
		super();
		this.m = m;
		m.regeister("market", this);
	}

	private Mediator m;//�����н��ߣ��ܾ���������
	
	@Override
	public void selfAction() {
		System.out.println("����Ŀ");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨���� ��Ŀ���� ��Ҫ�ʽ�");
		m.command("finacial");
	}

}

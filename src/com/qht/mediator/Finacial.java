package com.qht.mediator;

public class Finacial implements Department{

	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.regeister("finacial", this);
	}

	private Mediator m;//�����н��ߣ��ܾ���������
	
	@Override
	public void selfAction() {
		System.out.println("��Ǯ");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨Ǯ��");
	}

}

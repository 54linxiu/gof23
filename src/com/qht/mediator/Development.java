package com.qht.mediator;

public class Development implements Department{

	public Development(Mediator m) {
		super();
		this.m = m;
		m.regeister("development", this);
	}

	private Mediator m;//�����н��ߣ��ܾ���������
	
	@Override
	public void selfAction() {
		System.out.println("������Ŀ");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨����ûǮ�� ��Ҫ�ʽ�֧��");
	}

}

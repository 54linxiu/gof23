package com.qht.builder;

public class QhtAirShipBuilder implements AirShipBuilder{
	//����
	@Override
	public Engine buiilderEngine() {
		System.out.println("����������");
		return new Engine("������");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("���������");
		return new OrbitalModule("�����");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("����������");
		return new EscapeTower("������");
	}
	
}

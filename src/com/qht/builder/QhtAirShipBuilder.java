package com.qht.builder;

public class QhtAirShipBuilder implements AirShipBuilder{
	//构建
	@Override
	public Engine buiilderEngine() {
		System.out.println("构建发动机");
		return new Engine("发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建轨道仓");
		return new OrbitalModule("轨道仓");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建逃逸塔");
		return new EscapeTower("逃逸塔");
	}
	
}

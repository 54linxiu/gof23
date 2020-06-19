package com.qht.builder;

public class QhtAirshipDirector implements AirShipDirector{
	
	private QhtAirShipBuilder builder;
	
	public QhtAirshipDirector(QhtAirShipBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public AirShip directAirShip() {
		Engine e = builder.buiilderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		return ship;
	}

}

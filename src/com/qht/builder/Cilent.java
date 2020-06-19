package com.qht.builder;

public class Cilent {
	public static void main(String[] args) {
		QhtAirshipDirector director = new QhtAirshipDirector(new QhtAirShipBuilder());
		AirShip ship = director.directAirShip();
		System.out.println(ship.getEngine().getName());
	}
}

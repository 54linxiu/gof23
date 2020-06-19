package com.qht.decorator;

public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		System.out.println("增加新的功能 飞------");
		FlyCar flycar = new FlyCar(car);
		flycar.move();
		System.out.println("增加新的功能游泳------");
		SwimCar swimCar = new SwimCar(car);
		swimCar.move();
		
		System.out.println("---------");
		AiCar ai = new AiCar(new FlyCar(car));
		ai.move();
	}
}

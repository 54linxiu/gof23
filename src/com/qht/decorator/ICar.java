package com.qht.decorator;
/**
 * 抽象构建
 * @author q
 *
 */
public interface ICar {
	void move();
}
//真实对象
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("陆地上跑");
	}
	
}
//装饰角色
class SuperCar implements ICar{
	protected ICar car;
	
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}
	
}
//具体装饰对象
class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
		
	}
	public void fly() {
		System.out.println("天上飞");
	}
	
	public void move() {
		super.move();
		fly();
	}
}

class SwimCar extends SuperCar {

	public SwimCar(ICar car) {
		super(car);
		
	}
	public void swim() {
		System.out.println("水里游");
	}
	
	public void move() {
		super.move();
		swim();
	}
}


//具体装饰对象
class AiCar extends SuperCar {

	public AiCar(ICar car) {
		super(car);
		
	}
	public void aotu() {
		System.out.println("自动跑");
	}
	
	public void move() {
		super.move();
		aotu();
	}
}


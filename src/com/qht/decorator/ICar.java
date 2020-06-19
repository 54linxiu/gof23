package com.qht.decorator;
/**
 * ���󹹽�
 * @author q
 *
 */
public interface ICar {
	void move();
}
//��ʵ����
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("½������");
	}
	
}
//װ�ν�ɫ
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
//����װ�ζ���
class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
		
	}
	public void fly() {
		System.out.println("���Ϸ�");
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
		System.out.println("ˮ����");
	}
	
	public void move() {
		super.move();
		swim();
	}
}


//����װ�ζ���
class AiCar extends SuperCar {

	public AiCar(ICar car) {
		super(car);
		
	}
	public void aotu() {
		System.out.println("�Զ���");
	}
	
	public void move() {
		super.move();
		aotu();
	}
}


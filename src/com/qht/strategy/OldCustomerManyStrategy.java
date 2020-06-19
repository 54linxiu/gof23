package com.qht.strategy;

public class OldCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("АЫел");
		return standardPrice*0.8;
	}

}

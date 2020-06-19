package com.qht.strategy;

public class NewCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("æ≈’€");
		return standardPrice*0.9;
	}

}

package com.qht.strategy;

public class OldCustomerFweStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("������");
		return standardPrice*0.85;
	}

}

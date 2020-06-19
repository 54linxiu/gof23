package com.qht.strategy;

public class OldCustomerFweStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("°ËÎåÕÛ");
		return standardPrice*0.85;
	}

}

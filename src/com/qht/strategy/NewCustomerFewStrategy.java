package com.qht.strategy;

public class NewCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("≤ª¥Ú’€");
		return standardPrice;
	}

}

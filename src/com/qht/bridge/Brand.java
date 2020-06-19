package com.qht.bridge;

public interface Brand {
	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {
		System.out.println("销售联想电脑");	
	}
	
}

class Dill implements Brand{

	@Override
	public void sale() {
		System.out.println("销售Dill电脑");	
	}
	
}
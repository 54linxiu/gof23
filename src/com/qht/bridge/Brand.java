package com.qht.bridge;

public interface Brand {
	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {
		System.out.println("�����������");	
	}
	
}

class Dill implements Brand{

	@Override
	public void sale() {
		System.out.println("����Dill����");	
	}
	
}
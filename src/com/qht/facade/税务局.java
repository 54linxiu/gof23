package com.qht.facade;

public interface 税务局 {
	void Tax();
}
class 某某税务局 implements 税务局{

	@Override
	public void Tax() {
		System.out.println("等级税务");
	}
	
}
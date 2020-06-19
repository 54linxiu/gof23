package com.qht.facade;

public interface 质监局 {
	
	void qualitycontrol();

}
class 某某质监局 implements 质监局{

	@Override
	public void qualitycontrol() {
		System.out.println("质检");
	}
	
}

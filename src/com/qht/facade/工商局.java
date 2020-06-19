package com.qht.facade;

public interface 工商局 {
	void checkName();
}

class 某某工商局 implements 工商局{

	@Override
	public void checkName() {
		System.out.println("检查名字");
	}
	
}
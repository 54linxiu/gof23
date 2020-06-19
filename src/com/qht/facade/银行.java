package com.qht.facade;

public interface 银行 {
	void openCard();
}

class 某某银行  implements 银行{

	@Override
	public void openCard() {
		System.out.println("开卡");
	}
	
}
package com.qht.state;
/**
 * 
 * @author q
 *
 */
public class roomContext {
	//如果时银行系统，这个Context就是账号，根据金额不同，切换不同的状态
	private State state;
	
	public void setState(State s) {
		System.out.println("修改状态");
		state = s;
		state.handle();
	}
}

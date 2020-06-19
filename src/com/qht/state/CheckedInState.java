package com.qht.state;
/**
 * 住进来状态
 * @author q
 *
 */
public class CheckedInState implements State{

	@Override
	public void handle() {
		System.out.println("已入住");
	}
	
}

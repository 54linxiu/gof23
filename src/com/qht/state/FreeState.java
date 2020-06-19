package com.qht.state;
/**
 * 空闲状态
 * @author q
 *
 */
public class FreeState implements State{

	@Override
	public void handle() {
		System.out.println("房间空闲 没忍住");
	}
	
}

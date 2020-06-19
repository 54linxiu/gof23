package com.qht.state;
/**
 * 已预定状态
 * @author q
 *
 */
public class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("房间已预定");
	}
	
}

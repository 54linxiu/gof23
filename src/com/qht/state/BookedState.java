package com.qht.state;
/**
 * ��Ԥ��״̬
 * @author q
 *
 */
public class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("������Ԥ��");
	}
	
}

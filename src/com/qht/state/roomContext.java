package com.qht.state;
/**
 * 
 * @author q
 *
 */
public class roomContext {
	//���ʱ����ϵͳ�����Context�����˺ţ����ݽ�ͬ���л���ͬ��״̬
	private State state;
	
	public void setState(State s) {
		System.out.println("�޸�״̬");
		state = s;
		state.handle();
	}
}

package com.qht.adapter;
/**
 * ������ �൱��usbת��ps/2
 * ��Ϸ�ʽ
 * @author q
 *
 */
public class Adapter2  implements Target{

	private Adaptee adaptee;
	@Override
	public void handleReq() {
		adaptee.request();
	}
	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

}

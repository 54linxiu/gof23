package com.qht.adapter;
/**
 * 适配器 相当于usb转接ps/2
 * 组合方式
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

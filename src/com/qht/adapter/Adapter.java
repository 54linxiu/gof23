package com.qht.adapter;
/**
 * 适配器 相当于usb转接ps/2
 * 类适配方式
 * @author q
 *
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void handleReq() {
		super.request();
	}

}

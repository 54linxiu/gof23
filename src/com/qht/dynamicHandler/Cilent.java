package com.qht.dynamicHandler;

import java.lang.reflect.Proxy;

import com.qht.proxy.staticProxy.RealStar;
import com.qht.proxy.staticProxy.Star;

public class Cilent {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		StarHandler hamdler = new StarHandler(realStar);
		
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, hamdler);
		proxy.sing();
		/**
		 * loader - ������������������ 
			interfaces - ������ʵ�ֵĽӿ��б� 
			h - ���ȷ������õĵ��ô����� 
		 */
	}
}

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
		 * loader - 类加载器来定义代理类 
			interfaces - 代理类实现的接口列表 
			h - 调度方法调用的调用处理函数 
		 */
	}
}

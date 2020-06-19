package com.qht.dynamicHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.qht.proxy.staticProxy.Star;

public class StarHandler implements InvocationHandler{
	 
	Star realStar;
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//����ǳ��� 
		if(method.getName().equals("sing")) {			
			method.invoke(realStar, args);
		}else {
			System.out.println("����");
		}
		return null;
	}

}

package com.qht.factory;
/**
 * 简单工厂
 * @author q
 *
 */
public class Simplefactory {
	
	
		public static Car getCar(String type) {
			if("奥迪".equals(type)) {
				return new Audi();
			}else if("比亚迪".equals(type)) {
				return new Byd();
			}
			return null;
		}
	
}

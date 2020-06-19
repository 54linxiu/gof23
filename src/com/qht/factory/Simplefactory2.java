package com.qht.factory;
/**
 * ¼òµ¥¹¤³§
 * @author q
 *
 */
public class Simplefactory2 {
	
	
		public static Car getAudi(String type) {
			
				return new Audi();
			
		}
		
		public static Car getByd() {
			return new Byd();
			
		}
}

package com.qht.factory;
/**
 * �򵥹���
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

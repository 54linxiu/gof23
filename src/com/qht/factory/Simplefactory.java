package com.qht.factory;
/**
 * �򵥹���
 * @author q
 *
 */
public class Simplefactory {
	
	
		public static Car getCar(String type) {
			if("�µ�".equals(type)) {
				return new Audi();
			}else if("���ǵ�".equals(type)) {
				return new Byd();
			}
			return null;
		}
	
}

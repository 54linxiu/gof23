package com.qht.prototype;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 测试原型模式 浅克隆
 * 看shallowcop
 * @author q
 *
 */
public class Client2 {
	public static void main(String[] args) throws Exception {
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		LocalDateTime parse = LocalDateTime.parse("2011-05-15 00:00:00", dtf);
		Sheep2 s1 = new Sheep2("laohan",new Kl2(19));
		Sheep2 s2 = (Sheep2) s1.clone();
		System.out.println(s1);
		s1.setBirthday(20);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}

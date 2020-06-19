package com.qht.prototype;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 测试原型模式 浅克隆
 * 看shallowcop
 * @author q
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {
		//浅克隆 引用数据类型是地址传递（引用传递），所以修改值后另一个对象的该属性值会同步被修改
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		LocalDateTime parse = LocalDateTime.parse("2011-05-15 00:00:00", dtf);
		Sheep s1 = new Sheep("laohan",new Kl(19));
		Sheep s2 = (Sheep) s1.clone();
		System.out.println(s1);
		s1.setBirthday(20);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}

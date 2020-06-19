package com.qht.prototype;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试原型模式 序列化反序列化实现 深克隆
 * 看shallowcop
 * @author q
 *
 */
public class Client3 {
	public static void main(String[] args) throws Exception {
		
		Sheep s1 = new Sheep("laohan",new Kl(19));
		
		System.out.println(s1);
		
		System.out.println(s1.getSname());
		
		//Sheep s2 = (Sheep) s1.clone();
		
		FileOutputStream fos = new FileOutputStream("f:/test/t.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		FileInputStream fis = new FileInputStream("f:/test/t.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Sheep s2 = (Sheep)ois.readObject();
		
		s1.setBirthday(20);
		System.out.println(s1.getBirthday());
		
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}

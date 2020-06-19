package com.qht.prototype;
/**
 * ����new �������� ��Clone��ʽ��������
 * @author q
 *
 */
public class Client4 {
	public  static void testNew(int size) {
		long start = System.currentTimeMillis();
		for(int i = 0;i<size;i++) {
			Laptop f = new Laptop();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start+"new");
	}
	public  static void testClone(int size) throws CloneNotSupportedException {
		long start = System.currentTimeMillis();
		Laptop f = new Laptop();
		for(int i = 0;i<size;i++) {
			Laptop t = (Laptop) f.clone();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start+"clone");
	}
	
	public static void main(String[] args) throws Exception {
		testNew(1000);
		testClone(1000);
	}
}

class Laptop implements Cloneable{//�ʼǱ�����
	public Laptop() {
		try {
			Thread.sleep(10);//ģ�ⴴ����ʱ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
			Object obj = super.clone();
			return obj;
		}
}
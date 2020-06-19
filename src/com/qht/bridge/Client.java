package com.qht.bridge;

public class Client {
	public static void main(String[] args) {
		Brand lenovo = new Lenovo();
		Computer c = new Desktop(lenovo);
		c.sale();
		
		Brand dill = new Dill();
		Computer d = new Laptop(dill);
		d.sale();
	}
}

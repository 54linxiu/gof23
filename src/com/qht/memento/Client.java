package com.qht.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		Emp emp = new Emp("�˺�", 19, -111);
		System.out.println("��һ�δ�ӡ"+emp.getAge()+"---"+emp.getEname()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento());
//		taker.addemp(emp.memento());
		
		emp.setAge(18);
		emp.setEname("dafg");
		emp.setSalary(13524564);
		System.out.println("�ڶ��δ�ӡ"+emp.getAge()+"---"+emp.getEname()+"---"+emp.getSalary());
	
		emp.recovery(taker.getMemento());//�ָ�
//		taker.addemp(emp.memento());
		
//		emp.setAge(222);
//		emp.setEname("ddsfg");
//		emp.setSalary(915424564);
		System.out.println("�����δ�ӡ"+emp.getAge()+"---"+emp.getEname()+"---"+emp.getSalary());
//		taker.addemp(emp.memento());
//		emp.recovery(taker.getEmp(0));
//		System.out.println("��4�δ�ӡ"+emp.getAge()+"---"+emp.getEname()+"---"+emp.getSalary());
	}
}

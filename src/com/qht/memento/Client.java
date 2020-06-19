package com.qht.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		Emp emp = new Emp("账号", 19, -111);
		System.out.println("第一次打印"+emp.getAge()+"---"+emp.getEname()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento());
//		taker.addemp(emp.memento());
		
		emp.setAge(18);
		emp.setEname("dafg");
		emp.setSalary(13524564);
		System.out.println("第二次打印"+emp.getAge()+"---"+emp.getEname()+"---"+emp.getSalary());
	
		emp.recovery(taker.getMemento());//恢复
//		taker.addemp(emp.memento());
		
//		emp.setAge(222);
//		emp.setEname("ddsfg");
//		emp.setSalary(915424564);
		System.out.println("第三次打印"+emp.getAge()+"---"+emp.getEname()+"---"+emp.getSalary());
//		taker.addemp(emp.memento());
//		emp.recovery(taker.getEmp(0));
//		System.out.println("第4次打印"+emp.getAge()+"---"+emp.getEname()+"---"+emp.getSalary());
	}
}

package com.qht.Observer2;

public class Client {
	public static void main(String[] args) {
		//创建目标对象Obsserable
		ConcreteSubject subject=new ConcreteSubject();
		
		//创建观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//添加到到目标对象队列
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		
		subject.set(500);
		System.out.println("改变状态了");
		System.out.println("--------");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		subject.set(99500);
		System.out.println("改变状态了");
		System.out.println("--------");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
	}
}

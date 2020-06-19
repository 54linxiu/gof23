package com.qht.Observer;

public class Client {
	public static void main(String[] args) {
		//目标对象
		ConcreteSubject subject = new ConcreteSubject();
		
		//创建多个观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//将这三个添加到subject对象的观察者队伍中
		subject.register(obs1);
		subject.register(obs2);
		subject.register(obs3);
		
		//改变subject状态
		subject.setState(30000);
		System.out.println("--------------");
		//看看 观察者
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		//改变subject状态
				subject.setState(666);
				System.out.println("--------------");
				//看看 观察者
				System.out.println(obs1.getMyState());
				System.out.println(obs2.getMyState());
				System.out.println(obs3.getMyState());
	}
}

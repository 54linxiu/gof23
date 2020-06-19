package com.qht.Observer;

public class Client {
	public static void main(String[] args) {
		//Ŀ�����
		ConcreteSubject subject = new ConcreteSubject();
		
		//��������۲���
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//����������ӵ�subject����Ĺ۲��߶�����
		subject.register(obs1);
		subject.register(obs2);
		subject.register(obs3);
		
		//�ı�subject״̬
		subject.setState(30000);
		System.out.println("--------------");
		//���� �۲���
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		//�ı�subject״̬
				subject.setState(666);
				System.out.println("--------------");
				//���� �۲���
				System.out.println(obs1.getMyState());
				System.out.println(obs2.getMyState());
				System.out.println(obs3.getMyState());
	}
}

package com.qht.Observer2;

public class Client {
	public static void main(String[] args) {
		//����Ŀ�����Obsserable
		ConcreteSubject subject=new ConcreteSubject();
		
		//�����۲���
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//��ӵ���Ŀ��������
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		
		subject.set(500);
		System.out.println("�ı�״̬��");
		System.out.println("--------");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		subject.set(99500);
		System.out.println("�ı�״̬��");
		System.out.println("--------");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
	}
}

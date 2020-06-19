package com.qht.flyweight;

public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("��ɫ");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("��ɫ");
		System.out.println(chess1);
		System.out.println(chess2);
		
		System.out.println("�����ⲿ״̬�Ĵ���-----");
		chess1.display(new Corrdinate(10, 10));
		chess2.display(new Corrdinate(20, 10));
	}
}
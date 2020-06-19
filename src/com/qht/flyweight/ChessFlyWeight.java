package com.qht.flyweight;
/**
 * 享元类
 * @author q
 *
 */
public interface ChessFlyWeight {
	void setColor(String s);
	String getColor();
	void display(Corrdinate c);
}

class ConcreteChess implements ChessFlyWeight{
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}


	private String color;
	@Override
	public void setColor(String s) {
		this.color = s;
	}

	@Override
	public String getColor() {
		return color;
	}


	@Override
	public void display(Corrdinate c) {
		System.out.println("棋子"+color);
		System.out.println("棋子位置"+c.getX()+"  "+c.getY());
	}
	
}
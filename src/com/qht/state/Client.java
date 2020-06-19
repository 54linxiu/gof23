package com.qht.state;

public class Client {
	public static void main(String[] args) {
		roomContext ctx = new roomContext();
		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
	}
}

package com.qht.command;

public interface Command {
	/**
	 * 这个方法是一个返回结果为空的方法
	 * 实际项目中，可以根据需求设计多个不同的方法
	 */
	void execute();
}

class ConcreteCommand implements Command{
	private Receiver receiver;//真正的命令执行者
	@Override
	public void execute() {
		//命令真正执行前后，可以添加相关的处理
		receiver.action();
	}
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	
}
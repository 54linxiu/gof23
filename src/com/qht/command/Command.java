package com.qht.command;

public interface Command {
	/**
	 * ���������һ�����ؽ��Ϊ�յķ���
	 * ʵ����Ŀ�У����Ը���������ƶ����ͬ�ķ���
	 */
	void execute();
}

class ConcreteCommand implements Command{
	private Receiver receiver;//����������ִ����
	@Override
	public void execute() {
		//��������ִ��ǰ�󣬿���������صĴ���
		receiver.action();
	}
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	
}
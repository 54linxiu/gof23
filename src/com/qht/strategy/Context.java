package com.qht.strategy;
/**
 * ����;���Ĳ��Խ���
 * �����Ļ��������㷨��ֱ�ӵĿͻ��˵��÷����ˣ�ʹ���㷨���Զ����ڿͻ��˶����ڵı仯
 * @author q
 *���ʹ��spring������ע�빦�ܣ�������ͨ�������ļ�����̬ע�벻ͬ���Զ��󣬶�̬���л���ͬ���㷨
 */
public class Context {
	private Strategy strategy;

	//����ͨ��������ע��
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void pringPrice(double s) {
		System.out.println("���㱨��"+strategy.getPrice(s));
	}
	
}

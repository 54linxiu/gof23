package com.qht.iterator;
/**
 * �Զ���������ӿ�
 * @author q
 *
 */
public interface MyIterator {
	void first();//���α�ָ���һ��Ԫ��
	void next();//���α�֮����һ��
	boolean hasNext();//�ж��Ƿ������һ��
	
	boolean isFirst();
	boolean isLast();
	
	Object getCurrentObj();//��ȡ��ǰ�α�ָ��Ķ���
	
	boolean haszuihou();
	Object getCurrentObjzh();
	void syg();
}

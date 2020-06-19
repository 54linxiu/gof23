package com.qht.iterator;
/**
 * 自定义迭代器接口
 * @author q
 *
 */
public interface MyIterator {
	void first();//将游标指向第一个元素
	void next();//将游标之下下一个
	boolean hasNext();//判断是否存在下一个
	
	boolean isFirst();
	boolean isLast();
	
	Object getCurrentObj();//获取当前游标指向的对象
	
	boolean haszuihou();
	Object getCurrentObjzh();
	void syg();
}

package com.qht.composits;
/**
 * 抽象组件
 * @author q
 *
 */
public interface Component {
	void operation();
}
/**
 * 叶子组件
 * @author q
 *
 */
interface Lefa extends Component{
	
}
//容器组件
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}
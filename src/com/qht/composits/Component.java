package com.qht.composits;
/**
 * �������
 * @author q
 *
 */
public interface Component {
	void operation();
}
/**
 * Ҷ�����
 * @author q
 *
 */
interface Lefa extends Component{
	
}
//�������
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}
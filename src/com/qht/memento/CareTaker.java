package com.qht.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 * 负责管理备忘录对象
 * @author q
 *
 */
public class CareTaker {
	private EmpMemento memento;

	private List<EmpMemento> list = new ArrayList<EmpMemento>();
	
	public void addemp(EmpMemento e) {
		list.add(e);
	}
	
	public EmpMemento getEmp(int index) {
		return list.get(index);
	}
	
	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}
}

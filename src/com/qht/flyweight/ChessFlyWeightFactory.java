package com.qht.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ԫ������
 * @author q
 *
 */
public class ChessFlyWeightFactory {
	//��Ԫ�� ��������
	private static HashMap<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	
	public static ChessFlyWeight getChess(String color) {
		if(map.get(color)!=null) {
			return map.get(color);
		}else {
			ChessFlyWeight cfw = new ConcreteChess(color);
			map.put(color, cfw);
			return cfw;
		}
	}
}

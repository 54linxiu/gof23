package com.qht.iterator;

public class Client {
	public static void main(String[] args) {
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.addObject("aa");
		cma.addObject("bb");
		cma.addObject("cc");
		
		MyIterator itertor = cma.createIterator();
		while(itertor.hasNext()){
			System.out.println(itertor.getCurrentObj());
			itertor.next();
		}
		System.out.println("---------");
		while(itertor.haszuihou()){
			System.out.println(itertor.getCurrentObjzh());
			itertor.syg();
		}
	}
}

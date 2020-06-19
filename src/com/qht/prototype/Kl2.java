package com.qht.prototype;

public class Kl2 implements Cloneable{
	private int aaa;
	 public Kl2(int aaa) {
	        this.aaa=aaa;
	    }
	    
	    public int getAge() {
	        return aaa;
	    }
	    
	    public void setAge(int aaa) {
	        this.aaa = aaa;
	    }
	    
	    public String toString() {
	        return this.aaa+"";
	    }
	    
	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	    	  Object obj=null;
	          try {
	              obj=super.clone();
	          } catch (CloneNotSupportedException e) {
	              e.printStackTrace();
	          }
	          return obj;
	    }
}

package com.qht.prototype;

import java.io.Serializable;

public class Kl implements Serializable{
	private int aaa;
	 public Kl(int aaa) {
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
}

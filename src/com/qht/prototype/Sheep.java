package com.qht.prototype;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Sheep implements Cloneable,Serializable{ //克隆羊
	private String sname;
	private Kl birthday;
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
			Object obj = super.clone(); //直接调用object对象clone方法
			return obj;
		}


	
	public Sheep(String sname, Kl birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public Kl getBirthday() {
		return birthday;
	}



	public void setBirthday(int birthday) {
		this.birthday.setAge(birthday);
	}



	private void Sheeep() {
		
	}
}

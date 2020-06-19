package com.qht.prototype;

import java.time.LocalDateTime;


public class Sheep2 implements Cloneable{ //克隆羊
	private String sname;
	private Kl2 birthday;
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
		 Object obj=null;
	        //调用Object类的clone方法——拷贝
	        try {
	            obj= super.clone();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	        //调用Kl2类的clone方法进行深拷贝
	        //先将obj转化为类实例
	        Sheep2 s=(Sheep2)obj;
	        //学生类实例的Kl2对象属性，调用其clone方法进行拷贝
	        s.birthday=(Kl2)s.getBirthday().clone();
			return obj;
		}


	
	public Sheep2(String sname, Kl2 birthday) {
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



	public Kl2 getBirthday() {
		return birthday;
	}



	public void setBirthday(int birthday) {
		this.birthday.setAge(birthday);
	}



	private void Sheeep() {
		
	}
}

package com.qht.prototype;

import java.time.LocalDateTime;


public class Sheep2 implements Cloneable{ //��¡��
	private String sname;
	private Kl2 birthday;
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
		 Object obj=null;
	        //����Object���clone������������
	        try {
	            obj= super.clone();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	        //����Kl2���clone�����������
	        //�Ƚ�objת��Ϊ��ʵ��
	        Sheep2 s=(Sheep2)obj;
	        //ѧ����ʵ����Kl2�������ԣ�������clone�������п���
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

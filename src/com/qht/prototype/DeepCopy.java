package com.qht.prototype;
/* ��ε���clone����ʵ����� */
public class DeepCopy {
    public static void main(String[] args) {
        Ages a=new Ages(20);
        Stu stu1=new Stu("ҡͷҮ��",a,175);
        
        //ͨ��������д���clone��������ǳ����
        Stu stu2=(Stu)stu1.clone();
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
        System.out.println();
        
        //�����޸�stu1�еĸ����ԣ��۲�stu2��������û�б仯
        stu1.setName("��ɵ��");
        //�ı�age����������͵ĳ�Ա������ֵ
        a.setAge(99);
        //stu1.setaAge(new Age(99));    ʹ�����ַ�ʽ�޸�age����ֵ�Ļ���stu2�ǲ�����Ÿı�ġ���Ϊ������һ���µ�Age���������Ǹı�ԭ�����ʵ��ֵ
        stu1.setLength(216);
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
    }
}

/*
 * ����������
 */
class Ages implements Cloneable{
    //������ĳ�Ա���������ԣ�
    private int age;
    //���췽��
    public Ages(int age) {
        this.age=age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString() {
        return this.age+"";
    }
    
    //��дObject��clone����
    public Object clone() {
        Object obj=null;
        try {
            obj=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
/*
 * ����ѧ����
 */
class Stu implements Cloneable{
    //ѧ����ĳ�Ա���������ԣ�,����һ������Ϊ��Ķ���
    private String name;
    private Ages aage;
    private int length;
    //���췽��,����һ������Ϊ��һ����Ķ���
    public Stu(String name,Ages a,int length) {
        this.name=name;
        this.aage=a;
        this.length=length;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Ages getaAge() {
        return this.aage;
    }
    
    public void setaAge(Ages age) {
        this.aage=age;
    }
    
    public int getLength() {
        return this.length;
    }
    
    public void setLength(int length) {
        this.length=length;
    }
    public String toString() {
        return "�����ǣ� "+this.getName()+"�� ����Ϊ�� "+this.getaAge().toString()+", �����ǣ� "+this.getLength();
    }
    //��дObject���clone����
    public Object clone() {
        Object obj=null;
        //����Object���clone��������ǳ����
        try {
            obj= super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //����Age���clone�����������
        //�Ƚ�objת��Ϊѧ����ʵ��
        Stu stu=(Stu)obj;
        //ѧ����ʵ����Age�������ԣ�������clone�������п���
        stu.aage=(Ages)stu.getaAge().clone();
        return obj;
    }
}

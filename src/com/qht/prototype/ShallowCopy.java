package com.qht.prototype;
/**
 * ǳ��¡
 * @author q
 *
 */
public class ShallowCopy {
    public static void main(String[] args) {
        Age a=new Age(20);
        Student stu1=new Student("ҡͷҮ��",a,175);
        
        //ͨ��������д���clone��������ǳ����
        Student stu2=(Student)stu1.clone();
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
        
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
class Age{
    //������ĳ�Ա���������ԣ�
    private int age;
    //���췽��
    public Age(int age) {
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
}
/*
 * ����ѧ����
 */
class Student implements Cloneable{
    //ѧ����ĳ�Ա���������ԣ�,����һ������Ϊ��Ķ���
    private String name;
    private Age aage;
    private int length;
    //���췽��,����һ������Ϊ��һ����Ķ���
    public Student(String name,Age a,int length) {
        this.name=name;
        this.aage=a;
        this.length=length;
    }
    //eclipe��alt+shift+s�Զ�������е�set��get����
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Age getaAge() {
        return this.aage;
    }
    
    public void setaAge(Age age) {
        this.aage=age;
    }
    
    public int getLength() {
        return this.length;
    }
    
    public void setLength(int length) {
        this.length=length;
    }
    //����������ַ�����ʽ
    public String toString() {
        return "�����ǣ� "+this.getName()+"�� ����Ϊ�� "+this.getaAge().toString()+", �����ǣ� "+this.getLength();
    }
    //��дObject���clone����
    public Object clone() {
        Object obj=null;
        //����Object���clone����������һ��Objectʵ��
        try {
            obj= super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}


package com.qht.composits;

public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Folder f1 = new Folder("�ղ�");
		f2 = new ImageFile("img.jpg");
		f3 = new TextFile("�书�ؼ�.txt");
		f4 = new VideoFile("Ф��˵ľ���.avi");
		f5 = new VideoFile("С����.avi");
		f1.add(f2);
		f1.add(f3);
		
		
		Folder f11 = new Folder("��Ӱ");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		f1.killVirus(1);
	}
}

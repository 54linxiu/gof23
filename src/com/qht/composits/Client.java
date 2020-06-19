package com.qht.composits;

public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Folder f1 = new Folder("收藏");
		f2 = new ImageFile("img.jpg");
		f3 = new TextFile("武功秘籍.txt");
		f4 = new VideoFile("肖申克的救赎.avi");
		f5 = new VideoFile("小王子.avi");
		f1.add(f2);
		f1.add(f3);
		
		
		Folder f11 = new Folder("电影");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		f1.killVirus(1);
	}
}

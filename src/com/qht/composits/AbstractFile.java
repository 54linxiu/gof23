package com.qht.composits;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象构建
 * @author q
 *
 */
public interface AbstractFile {
	void killVirus(int count);//杀毒
}

class ImageFile implements AbstractFile{
	private String name;
	public ImageFile(String name) {
		super();
		this.name = name;
	}
	@Override
	public void killVirus(int count) {
		for(int i = 0;count>i;i++) {
			System.out.print("-");
		}
		System.out.println("图像文件"+name+"进行查杀");
		
	}
	
}

class TextFile implements AbstractFile{
	private String name;
	public TextFile(String name) {
		super();
		this.name = name;
	}
	@Override
	public void killVirus(int count) {
		for(int i = 0;count>i;i++) {
			System.out.print("-");
		}
		System.out.println("图像文件"+name+"进行查杀");
		
	}
	
}

class VideoFile implements AbstractFile{
	private String name;
	public VideoFile(String name) {
		super();
		this.name = name;
	}
	@Override
	public void killVirus(int count) {
		for(int i = 0;count>i;i++) {
			System.out.print("-");
		}
		System.out.println("图像文件"+name+"进行查杀");
		
	}
	
}

class Folder implements AbstractFile{
	private String name;
	//容器，用来存放容器构建下的子节点
	private List<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}
	public void add(AbstractFile file) {
		list.add(file);
	}
	public void remove(AbstractFile file) {
		list.remove(file);
	}
	public AbstractFile getChild(int index) {
		return list.get(index);
	}
	@Override
	public void killVirus(int count) {
		for(int i = 1;count>i;i++) {
			System.out.print("-");
		}
		System.out.println("文件夹"+name+"进行查杀");
		
		for(AbstractFile file:list) {
			if(file instanceof Folder)
				count++;
			file.killVirus(count);
		}
	}
}

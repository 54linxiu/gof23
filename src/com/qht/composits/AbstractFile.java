package com.qht.composits;

import java.util.ArrayList;
import java.util.List;

/**
 * ���󹹽�
 * @author q
 *
 */
public interface AbstractFile {
	void killVirus(int count);//ɱ��
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
		System.out.println("ͼ���ļ�"+name+"���в�ɱ");
		
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
		System.out.println("ͼ���ļ�"+name+"���в�ɱ");
		
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
		System.out.println("ͼ���ļ�"+name+"���в�ɱ");
		
	}
	
}

class Folder implements AbstractFile{
	private String name;
	//����������������������µ��ӽڵ�
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
		System.out.println("�ļ���"+name+"���в�ɱ");
		
		for(AbstractFile file:list) {
			if(file instanceof Folder)
				count++;
			file.killVirus(count);
		}
	}
}

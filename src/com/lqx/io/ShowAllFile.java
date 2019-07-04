package com.lqx.io;

import java.io.File;

public class ShowAllFile {
	public static void ShowAllFile(File file) {
		//ตÝน้
		if(file.isFile()) {
			return;
		}
		File[] listFiles = file.listFiles();
		for(File f:listFiles) {
			if(f.isFile()){
				System.out.println(f.getAbsolutePath());
			}else {
				ShowAllFile(f);
			}
		}
	}
	public static void main(String[] args) {
		File file = new File("D:/Epic Games");
		ShowAllFile(file);
	}
}
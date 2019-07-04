package com.lqx.io;

import java.io.*;

public class Lqx {
	public static void main(String[] args) throws IOException {
		File file  = new File("d:/lqx/goods.txt");
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write("这里有点内容这里有点内容这里有点内容这里有点内容");
		osw.flush();
		osw.close();
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isw = new InputStreamReader(fis);
		char[] ch = new char[4];
		isw.read(ch);
		while(isw.ready()){
			System.out.print(new String(ch));
			isw.read(ch);
		}
		isw.close();
	}
}

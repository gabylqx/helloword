package com.lqx.io;

import java.io.*;


public class LqxObjectRead {
	public static void main(String[] args) throws ReflectiveOperationException, IOException {
		File file = new File("D:/lqx/852.txt");
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		Dog d = new Dog();
		for (int i = 0; i < 4 ; i++) {
			d = (Dog) ois.readObject();
			System.out.println(d);
		}
		ois.close();
		is.close();
	}
}

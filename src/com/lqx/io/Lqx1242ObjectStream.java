package com.lqx.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lqx1242ObjectStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("D:/lqx/852.txt");
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		Dog d1 = new Dog("С��",25);
		Dog d2 = new Dog("С��",2);
		Dog d3 = new Dog("���",10);
		Dog d4 = new Dog("Сè",6);
		oos.writeObject(d1);
		oos.writeObject(d2);
		oos.writeObject(d3);
		oos.writeObject(d4);
		oos.flush();
		oos.close();
		os.close();
		

		
	}
	
}
package com.lqx.BuyMgr;

import java.io.*;
import java.util.*;

public class GoodsMgr {
	static List<Goods> list = new ArrayList<Goods>(); 
	static {
		File file = new File("d:/lqx/goods.txt");
		InputStream is = null;
		ObjectInputStream ois = null;
		try {
			is = new FileInputStream(file);
			ois = new ObjectInputStream(is);
			while(is.available()>0) {
				Goods goods =(Goods) ois.readObject();
				list.add(goods);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
		}
	}
}

package com.lqx.BuyMgr;

import java.io.*;
import java.util.*;

public class ShopsMgr {
	static List<Shops> list = new ArrayList<Shops>(); 
	static {
		File file = new File("d:/lqx/goods.txt");
		InputStream is = null;
		ObjectInputStream ois = null;
		try {
			is = new FileInputStream(file);
			ois = new ObjectInputStream(is);
			while(is.available()>0) {
				Shops shops =(Shops) ois.readObject();
				list.add(shops);
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

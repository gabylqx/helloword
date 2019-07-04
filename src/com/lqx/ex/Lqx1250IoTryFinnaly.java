package com.lqx.ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class Lqx1250IoTryFinnaly {
	public static void main(String[] args) {
//		编写一段向一个文件写入内容的代码
//		使用 try/catch 处理异常
//		并在 finnally 中处理流
		FileWriter os = null;
		try {
			os = new FileWriter("d://a/daxx");
			os.write("你好");
		}catch (FileNotFoundException e) {
			System.out.println("错误："+e.getMessage()+"，尝试打开默认文件写入");
			try {
				os = new FileWriter("d:/daxx.txt");
				os.write("你好");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally");
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}

package com.lqx.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class text {
	public static void main(String[] args) throws IOException {
		String str = "abc0123xyososjejxAAA";
		ByteArrayInputStream bais = new ByteArrayInputStream(str.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int tmp;
		while((tmp = bais.read())!=-1){
//			a-j 转换成 0-9,把 0-9 转换成 a-j,
//			其它字母，大写改成小写，小写改成大写
			char ch = ' ';
			if(tmp>='a'&&tmp<='j') {
				ch = (char)(tmp - 49);
			}else if((tmp>='0')&&(tmp<='9')){
				ch = (char)(tmp + 49);
			}else if(tmp>='h'&&tmp<='z') {
				ch = (char)(tmp - 32);
			}else if(tmp>='A'&&tmp<='Z') {
				ch = (char)(tmp + 32);
			}
			baos.write(ch);
		}
		String str1 = baos.toString();
		baos.close();
		bais.close();
		System.out.println(str1);
	}
}

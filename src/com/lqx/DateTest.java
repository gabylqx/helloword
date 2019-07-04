package com.lqx;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) throws ParseException {
//		定义一个日期变量 dt，初始成当前
		Date dt = new Date();
//		使用 DateFormat, 以 yy-MM-dd 格式显示 dt
		DateFormat df = DateFormat.getDateInstance(3);
		System.out.println(df.format(dt));
		
//		使用 SimpleDateFormat,以 2016 年 05 月 06 日 08:51:09 的格式，
//		显示 2016 年 3 月 10 16 点这个时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年  MM月  dd日  HH:mm:ss");
		dt = sdf.parse("2016年  3月  10日  16:00:00");
		System.out.println(sdf.format(dt));
//		DecimalForm
//		以小数方法显示一个数字
		DecimalFormat dfm = new DecimalFormat(".00");
		System.out.println(dfm.format(5614));
//		以科学计数法显示一个数字
		DecimalFormat dfm1 = new DecimalFormat("0.##E0");
		System.out.println(dfm1.format(5614.8818));
//		把 12345.456 显示成 12,345.46
		DecimalFormat dfm2 = new DecimalFormat("#,###.00");
		System.out.println(dfm2.format(12345.456));
//		把 12345.456 显示成 0,012,345.4560
		DecimalFormat dfm3 = new DecimalFormat("0000,000.0000");
		System.out.println(dfm3.format(12345.456));
//		把 12345.456 显示成 1235645.6 %
		DecimalFormat dfm4 = new DecimalFormat("#.#%");
		System.out.println(dfm4.format(12345.456));
//		把 12345.456 显示成 12,345,456 ‰
		DecimalFormat dfm5 = new DecimalFormat(",###\u2030");
		System.out.println(dfm5.format(12345.456));
//		使 Math.random 产生一些 100 学生成绩，放入数组当中
		DecimalFormat dfm6 = new DecimalFormat("##.#");
		double[] a = new double[100]; 
		for (int i = 0; i < a.length; i++) {
			 double d = Double.parseDouble(dfm6.format(Math.random()*100));
			 a[i] =  d ;
			 System.out.print("第"+(i+1)+"个分数："+a[i]);
			 if(i%10 == 0) {
				 System.out.println();
			 }
		}
		
	}
}

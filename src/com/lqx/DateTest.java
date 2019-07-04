package com.lqx;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) throws ParseException {
//		����һ�����ڱ��� dt����ʼ�ɵ�ǰ
		Date dt = new Date();
//		ʹ�� DateFormat, �� yy-MM-dd ��ʽ��ʾ dt
		DateFormat df = DateFormat.getDateInstance(3);
		System.out.println(df.format(dt));
		
//		ʹ�� SimpleDateFormat,�� 2016 �� 05 �� 06 �� 08:51:09 �ĸ�ʽ��
//		��ʾ 2016 �� 3 �� 10 16 �����ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��  MM��  dd��  HH:mm:ss");
		dt = sdf.parse("2016��  3��  10��  16:00:00");
		System.out.println(sdf.format(dt));
//		DecimalForm
//		��С��������ʾһ������
		DecimalFormat dfm = new DecimalFormat(".00");
		System.out.println(dfm.format(5614));
//		�Կ�ѧ��������ʾһ������
		DecimalFormat dfm1 = new DecimalFormat("0.##E0");
		System.out.println(dfm1.format(5614.8818));
//		�� 12345.456 ��ʾ�� 12,345.46
		DecimalFormat dfm2 = new DecimalFormat("#,###.00");
		System.out.println(dfm2.format(12345.456));
//		�� 12345.456 ��ʾ�� 0,012,345.4560
		DecimalFormat dfm3 = new DecimalFormat("0000,000.0000");
		System.out.println(dfm3.format(12345.456));
//		�� 12345.456 ��ʾ�� 1235645.6 %
		DecimalFormat dfm4 = new DecimalFormat("#.#%");
		System.out.println(dfm4.format(12345.456));
//		�� 12345.456 ��ʾ�� 12,345,456 ��
		DecimalFormat dfm5 = new DecimalFormat(",###\u2030");
		System.out.println(dfm5.format(12345.456));
//		ʹ Math.random ����һЩ 100 ѧ���ɼ����������鵱��
		DecimalFormat dfm6 = new DecimalFormat("##.#");
		double[] a = new double[100]; 
		for (int i = 0; i < a.length; i++) {
			 double d = Double.parseDouble(dfm6.format(Math.random()*100));
			 a[i] =  d ;
			 System.out.print("��"+(i+1)+"��������"+a[i]);
			 if(i%10 == 0) {
				 System.out.println();
			 }
		}
		
	}
}

package com.lqx.Lqx1215Collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.lqx.lqx;

public class Test {
	public static void main(String[] args) throws ParseException {
//		1. ���� List, ����һЩ����,key ���򷽷�
		List ls = new ArrayList();
//		ʹ�� Collections �ĸ��ַ������� List ���в���
		ls.add("851");
		ls.add("dvf");
		ls.add("ttt");
		ls.add("abc");
		ls.add("aaa");
		ls.add("ttt");
		System.out.println(ls);
		Collections.reverse(ls);//��ת
		System.out.println(ls);
		Collections.shuffle(ls);//�������
		System.out.println(ls);
		Collections.sort(ls);//��������
		System.out.println(ls);
		Collections.swap(ls, 1, 3);;//Ԫ�ػ�λ
		System.out.println(ls);
		System.out.println(Collections.max(ls));//�������Ԫ��
		System.out.println(Collections.frequency(ls, "ttt"));//����ָ��Ԫ�س��ִ���
		lqx.p();
//		2. �Է��ͷ�������һ�� list
		List<Date> ls1 = new ArrayList<Date>();
//		Ϊ����뼸������ֵ��Ȼ����ʾ������
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		ls1.add(s.parse("2018-08-17  11:02:23"));
		ls1.add(s.parse("2014-05-17  16:29:40"));
		ls1.add(s.parse("2008-12-17  12:52:25"));
		ls1.add(s.parse("2019-09-17  08:32:30"));
		for(Object o:ls1) {
			System.out.println(o);
		}
		lqx.p();
		Collections.shuffle(ls1);
		for(Object o:ls1) {
			System.out.println(o);
		}
		lqx.p();
//		3. ��һ�� Set ������һЩ Dog,Ȼ����ʾȫ������
		Set<Dog> set = new HashSet<Dog>();
		set.add(new Dog("С��",5));
		set.add(new Dog("С��",8));
		set.add(new Dog("С��",2));
		set.add(new Dog("С��",3));
		for(Dog o : set) {
			System.out.println(o);
		}
		lqx.p();
//		4. ��һ�� Map ������һЩְԱ Clerk,Ȼ����ʾȫ������
		Map map = new HashMap();
		map.put(1,new Clerk());
		map.put(2,new Clerk(1,"������",4500.));
		map.put(3,new Clerk(2,"������",8000.));
		map.put(4,new Clerk(3,"������",6000.));
		Set set1  = map.keySet();
		for(Object oj:set1) {
			System.out.println(oj+"/"+map.get(oj));
		}
	}
}
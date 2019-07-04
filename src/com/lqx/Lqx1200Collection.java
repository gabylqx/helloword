package com.lqx;
import java.util.*;

public class Lqx1200Collection {
	public static void main(String[] args) {
//		���� Collection, ����һЩ����
		Collection c = new ArrayList();
		c.add(12);
		c.add("abc");
		c.add("sssss");
//		������ϳ���
		System.out.println(c.size());
		System.out.println("--------------------");
//		�������ȫ������
		System.out.println(c);
		System.out.println("--------------------");
//		�Ѽ���ת�����飬���������
		Object[] obs = c.toArray();
		System.out.println(Arrays.toString(obs));
		System.out.println("--------------------");
//		�Ѽ�����պ��ټ���Ϊ��
		c.clear();
		System.out.println(c);
		System.out.println("--------------------");
//		��������һЩ���ݣ����ĳһ�������Ƿ��ڼ�����
		c.add("a1a1");
		c.add(12);
		c.add("sssss");
		System.out.println(c.contains("a1a1"));
		System.out.println("--------------------");
//		�ٶ���һ�����ϣ���ԭ�����ϵ��е����ݼ����¼��ϵ���
		Collection c1 = new ArrayList();
		c1.addAll(c);
//		�����������������Ƿ����
		System.out.println(c1.containsAll(c));
		System.out.println("--------------------");
//		дһ�� collection ���ϣ�ʹ�� HashSet ���� 5 ����Ա
		Collection c2 = new ArrayList();
		HashSet names = new HashSet();
		names.add("abc");
		names.add("asd");
		names.add("ddd");
		names.add("cccc");
		names.add("ddd");
		c2.addAll(names);
//		�ֱ��� iteror ��ʾ
		Iterator iter = c2.iterator();
		while(iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o);
		}
		System.out.println("--------------------");
//		ʹ�� remove �Ƴ���������Ȼ���� foreach ��ʾ����
		c2.remove("ddd");
		c2.remove("asd");
		for(Object o:c2) {
			System.out.println(o);
		}
	}
}

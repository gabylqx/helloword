package com.lqx.Lqx1212Map;

import java.util.*;
import com.lqx.lqx;

public class Test {
	public static void main(String[] args) {
//		1.���� Map, ����һЩ����
		System.out.println((int)'\r');
		Map map = new HashMap();
		map.put("key", "ddd");
		map.put("5key", "value");
		map.put("4key", "rht");
		map.put("8key", "jtjy");
		map.put("1key", "tjyhbv");
		System.out.println(map.get("key"));
		lqx.p();
//		ʹ�� entrySet ��ʽ��ʾȫ������ֵ�����ݣ�)
		System.out.println(map.entrySet());
		lqx.p();
//		ʹ�� keySet ��ʽ��ʾȫ������ֵ����
		Set set  = map.keySet();
		for(Object oj:set) {
			System.out.println(oj+"\t"+map.get(oj));
		}
		lqx.p();
//		ʹ�� values ��ʾȫ��ֵ����
		System.out.println(map.values());
		lqx.p();
//		ʹ�÷�����containValue(), containKey()
		System.out.println(map.containsValue("value"));
		lqx.p();
//		ʹ�� clear, isEmpty, size, hashcode �ȷ���
		map.clear();
		System.out.println(map.entrySet());
		System.out.println(map.isEmpty());
		map.put("8key", "jtjy");
		System.out.println(map.isEmpty());
		System.out.println(map.hashCode());
		lqx.p();
//		���� TreeMap, ����һЩ����,key ���򷽷�
		Map map1 = new TreeMap();
		map1.put("4key", "rht");
		map1.put("8key", "jtjy");
		map1.put("1key", "tjyhbv");
//		ʹ�� entrSet ��ʾ������ע����˳��
		System.out.println(map1.entrySet());
	}
}

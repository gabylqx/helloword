package com.lqx.Lqx1212Map;

import java.util.*;
import com.lqx.lqx;

public class Test {
	public static void main(String[] args) {
//		1.定义 Map, 加入一些数据
		System.out.println((int)'\r');
		Map map = new HashMap();
		map.put("key", "ddd");
		map.put("5key", "value");
		map.put("4key", "rht");
		map.put("8key", "jtjy");
		map.put("1key", "tjyhbv");
		System.out.println(map.get("key"));
		lqx.p();
//		使用 entrySet 方式显示全部键、值其内容（)
		System.out.println(map.entrySet());
		lqx.p();
//		使用 keySet 方式显示全部键、值内容
		Set set  = map.keySet();
		for(Object oj:set) {
			System.out.println(oj+"\t"+map.get(oj));
		}
		lqx.p();
//		使用 values 显示全部值内容
		System.out.println(map.values());
		lqx.p();
//		使用方法：containValue(), containKey()
		System.out.println(map.containsValue("value"));
		lqx.p();
//		使用 clear, isEmpty, size, hashcode 等方法
		map.clear();
		System.out.println(map.entrySet());
		System.out.println(map.isEmpty());
		map.put("8key", "jtjy");
		System.out.println(map.isEmpty());
		System.out.println(map.hashCode());
		lqx.p();
//		定义 TreeMap, 加入一些数据,key 乱序方法
		Map map1 = new TreeMap();
		map1.put("4key", "rht");
		map1.put("8key", "jtjy");
		map1.put("1key", "tjyhbv");
//		使用 entrSet 显示其内容注意其顺序
		System.out.println(map1.entrySet());
	}
}

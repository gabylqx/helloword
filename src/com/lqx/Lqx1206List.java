package com.lqx;

import java.util.*;

public class Lqx1206List {
	public static void main(String[] args) {
//		���� List, ����һЩ�Զ�����
		List l = new ArrayList();
		l.add("sfdsd");
		l.add("fsd");
		l.add("ht");
		l.add("rtjr");
		l.add("rtyd");
//		1. Ȼ����ʾ������
		System.out.println(l);
		System.out.println("---------------------");
//		2. ʹ�� ListIterator �� next ��ʽ����ʾȫ������
		ListIterator lt = l.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		System.out.println("---------------------");
//		3. ʹ�� ListIterator �� previous ��ʽ����ʾȫ������
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}
	}
}

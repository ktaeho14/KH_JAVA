package com.collection.part01_list_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {

	public void testArrayList() {
		//ArrayList ��ü ����
		ArrayList alist = new ArrayList();
	
		//������ ����
		List list = new ArrayList();
		
		
		//�߰����ִ� �޼ҵ� add(�ڷ���);
		alist.add("apple");
		alist.add(123);
		alist.add(45.67);
		alist.add(new Date());
		
		
		
		System.out.println("alist: " + alist);
		
		for(int i=0; i<alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
		}
		
		//������ �ߺ� ������ ����Ѵ�
		alist.add("apple");
		System.out.println("alist: " + alist);
		
		//���ڸ� �߰����� �߰��� �������
		alist.add(1, "banana");
		System.out.println(alist);
		
		//remove(index) ����� �޼ҵ�
		alist.remove(2);
		System.out.println(alist);
		
		//���ϴ� ��ġ�� ��ü�� �����ϴ� �޼ҵ�  alist.set(index, element);
		alist.set(1, new Boolean(true));
		System.out.println(alist);
		
		
	}
	
	
	public void testArrayList2() {
		//ArrayList�� �������� ������ �� �� �ֵ��� sort() �޼ҵ� ��� ����
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("grape");
		list.add("orange");
		list.add("pear");
		list.add("blueberry");
		
		
		System.out.println("list: " + list);
		
		//���� �������� Collections.sort(ArrayList����);
		Collections.sort(list);
		System.out.println("listSort: " + list);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package com.collection.part01_list_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		
		
		
		
		//��ü ����
		ArrayList alist = new ArrayList();
		
		//������ ���� ��ü����
		List list = new ArrayList();
		
		//�߰����ִ� �޼ҵ� add(�ڷ���);
		list.add("sooho");
		list.add(123);
		list.add(4.5);
		
		
		alist.add("babo");
		alist.add("hye");
		alist.add(28);
		
		System.out.println("list: " + list);
		System.out.println("alist: " + alist);
	
		//���� ���� �ϳ��� Ȯ���غ��� ������
		for(int i =0; i<list.size(); i++) {
			System.out.println("list: " + list.get(i));
		}
	
		//������ �ߺ� ������ ����Ѵ�
		list.add("sooho");
		System.out.println("sooho�߰� list: " + list);
	
		//���ڸ� �߰����� �߰��� ����־��
		list.add(1, "sooho1");
		System.out.println("index1���� sooho1�߰� list : " + list);
		
		
		//remove(index) ����� �޼ҵ�
		list.remove(1);
		System.out.println("index 1���� sooho1�� ����� remove��� list: " + list);
		
		
		//���ϴ� ��ġ�� ��ü�� �����ϴ� �޼ҵ� alist.set(index, element);
		alist.set(0, new String("hyewon"));
		System.out.println("set�� ����� index 1�� 123�� hyewon�̶�� String ��ü�� ���� list : " + list);
	}
	
	
	

}

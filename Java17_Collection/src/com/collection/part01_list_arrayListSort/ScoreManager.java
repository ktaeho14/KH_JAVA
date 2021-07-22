package com.collection.part01_list_arrayListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreManager {
	
	public void scoreSort() {
		List list = new ArrayList();
		
		list.add(new Score("���ȣ",99));
		list.add(new Score("������",75));
		list.add(new Score("�ǹ���",52));
		
		
		list.add(new Score("����ȣ",86));
		list.add(new Score("������",32));
		list.add(new Score("�赿��",68));
		
		
		System.out.println("list: " + list);
		
		//����
		//1. Comparable - �⺻ ���� ���� ����
		Collections.sort(list);
		System.out.println("list: " + list);
		
		//2. Comparator = �⺻ ���� ���� �ܿ� �ٸ� �������� ����
		Collections.sort(list, new ScoreSorting());
		System.out.println("Comparator: " + list);
		
		list.sort(new ScoreSorting2());
		System.out.println(list);
		
		System.out.println("===============");
		list.sort(null);
		System.out.println(list);
	}
}

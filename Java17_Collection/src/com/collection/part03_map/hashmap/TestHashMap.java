package com.collection.part03_map.hashmap;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	
	public void testHashMap() {
		HashMap hmap = new HashMap();
		
		hmap.put("one", new Date());
		hmap.put(12, "red apple");
		hmap.put(33,123);
		//autoboxingó�� : 12 => new Integer(12);
		
		System.out.println("hmap: " + hmap);
		
		hmap.put(12,"yellow banana");
		System.out.println("hmap: " + hmap);
		
		
		//Ű�� �ߺ� �����������(set) : �ֱ� Ű�� ���
		//������ �ߺ� �����(List)�� ���� Ư¡�� �������ִ�
		hmap.put(11,"yellow banana");
		hmap.put(19,"yellow banana");
		System.out.println("hmap: " + hmap);
		
		
		System.out.println("Ű 19�� ���� ��ü: " + hmap.get("one"));
		
		
		//����
		hmap.remove(19);
		System.out.println("hmap: " + hmap);
		
		System.out.println("hmap�� ����� ��ü ��: " + hmap.size());
		
		
	}
	
	public void testHashMap2() {
		
		HashMap hmap = new HashMap();
		hmap.put("one","java");
		hmap.put("two","oracle");
		hmap.put("three","jdbc");
		hmap.put("four","html5");
		hmap.put("five","css3");
		
		
		//Map�� ����� ��ü ������ ���� ó�� �׽�Ʈ
		
		//1. keySet()�� �̿��Ͽ� key�� set���� ���� ����
		//iterator()�� Ű�� ���� ����� �����.
		
		Set keys = hmap.keySet();
		Iterator keyIter = keys.iterator();
		
		while(keyIter.hasNext()) {
			String key = (String)keyIter.next();
			String value = (String) hmap.get(key);
			System.out.println(key + "=" + value);
		}
		
		
		//2. ����� value ��ü�鸸 values()�� collection���� �����.
		Collection values = hmap.values();
		
		//2-1. Iterator()
		Iterator  valueIter = values.iterator();
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		
		//2-2 �迭�� ���� ó�� toArray()
		Object[] valueArr = values.toArray();
		for(int i=0; i<valueArr.length; i++) {
			System.out.println(i+ " : " +valueArr[i]);
		}
		
		//3. Map ���� Ŭ������ Entry�� �̿��� entrySet() Ȱ��
		Set set = hmap.entrySet();
		//Entry : Ű&���� �� ������ ���� ��
		
		Iterator entryIter = set.iterator();
		while(entryIter.hasNext()) {
			Map.Entry entry = (Map.Entry)entryIter.next();
		
			System.out.println(entry.getKey()+ ": " + entry.getValue());
		
		
		
		
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

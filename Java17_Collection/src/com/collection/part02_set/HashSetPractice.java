package com.collection.part02_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
		Set hset = new HashSet();
		
		
		hset.add("��");
		hset.add(11);
		hset.add(0.1);
		System.out.println(hset);
		
		
		Object ob[] = hset.toArray();
		for(int i =0; i<ob.length; i++) {
			System.out.println(ob[i]);
		}
		
		//hasnext  next() �� ����� ��¹�
		
		Iterator iter = hset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
	}

}

package com.collection.part02_set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	public void testHashSet() {
		HashSet hset = new HashSet();
		
// 		Set hset2 = new HashSet();
	
	
	hset.add(new String("java"));
	hset.add(new Integer(123));
	hset.add(new Double(45.67));
	hset.add(new Date());
	
	//���� ���� ���� �ȵ�
	System.out.println("hst: " + hset);
	
	
	//�ߺ� ��� ����(�߰� �����ʴ´�)
	hset.add(new String("java"));
	hset.add(new Integer(123));
	System.out.println("hset: " + hset);
	//size���� �߰������ʴ´�
	System.out.println("����� ��ü ��: " + hset.size());
	
	//������ �Ǿ��ִ��� ����Ȯ�� .contains(element)
	System.out.println("����Ȯ��: "+ hset.contains(123));
	
	
	
	
	
	
	///
	
	Set set = new HashSet();
	set.add(new Score("��â��",89));
	set.add(new Score("���ȣ",99));
	set.add(new Score("�̿���",77));
	
	System.out.println("set: " + set);
	
	set.add(new Score("������",66));
	set.add(new Score("���ȣ",99));
	
	System.out.println("set: " + set);
	System.out.println("setSize:" + set.size());
	
	
	//����� ��ü �ϳ��� ���� ����
	//�ذ���
	//1. toArray()
	Object[] arr = hset.toArray();
	for(int i=0; i<arr.length; i++) {
		System.out.println(i + " , " + arr[i]);
	}
	
	//2. Iterator()
	//Iterator() �� ���� �����Ŀ� hasNext()�� �ڿ��ֳ� �ݺ�
	//next()�� ���� ��ü�� ���
	Iterator iter = hset.iterator();
	
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	//�����
	hset.clear();
	System.out.println("empty?: " + hset.isEmpty());
	
	
	
	
	
	}
	
	
	
	
}

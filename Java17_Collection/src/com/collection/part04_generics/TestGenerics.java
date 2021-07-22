package com.collection.part04_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestGenerics {

	public void testGenerics() {
		List list = new ArrayList();
		
		list.add(new String("generics test"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());
		
		System.out.println("����� ��ü ��: " + list.size());
		System.out.println("list: " + list);
		
		//����� ��ü�� �ϳ� �� ��������
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			
			
			//instanceof�� ���� obj�� � ��ü���� Ȯ�����ϰ�
			//��ü�� �°� ObjectŸ���� obj�� ����ȯ�� ���� .�޼ҵ� �� �����Ѱ�
			
			
			if(obj instanceof Book) {
				((Book)obj).printBook();
				
			}
			if(obj instanceof Student) {
				((Student)obj).score();
			}
			
			if(obj instanceof Car) {
				((Car)obj).printCar();
			}
		}
		
		
		
	}
	
	public void testGenerics2() {
		
		List<Book> list = new ArrayList<Book>();
		
		//Generics �� BookŸ������ �����Ǿ��־ StringŸ���� ���� �� �� ����.
		//list.add("Test");
		list.add(new Book());
		list.add(new Book());
		
		for(Book b : list) {
			b.printBook();
		}
		for(int i=0; i<list.size(); i++) {
			Book b =list.get(i);
			b.printBook();
		}
		
		
		
		//Generics �� ������� ������ �� ��ü�� ���� �Ŀ� ����ȯ �۾����� �ؾ��ϴ� �������� �����.
		System.out.println("============");
		ArrayList list2 = new ArrayList();
		list2.add(new Book());
		list2.add(new Car());
		
		for(int i =0; i<list2.size(); i++) {
			Object obj = list2.get(i);
			
			if(obj instanceof Book) {
				((Book)obj).printBook();
			}
			
		}
		
		
		
		
	}
	
	
	public void testGeneric3() {
		HashMap<String,Book> map = new HashMap<String,Book>();
		map.put("one", new Book("java"));
		map.put("two", new Book("oracle"));
		map.put("three", new Book("jdbc"));
		
		System.out.println(map);
		
		
		//Map.Entry�� �̿��Ͽ� Iterator�� �����ϰ� Ű ������ ���ÿ� ó��
		//entrySet();
		
		Set<Map.Entry<String, Book>> entry = map.entrySet();
		
		Iterator<Map.Entry<String, Book>> iter = entry.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Book> ent = iter.next();
			String key = ent.getKey();
			Book value = (Book)ent.getValue();
			
			System.out.println(key + ":" + value);
		}
		
		
		//key�� �����Ͽ� Iterator ����
		//keySet();
		
		Set<String> keys = map.keySet();
		Iterator<String> keyIter = keys.iterator();
		
		
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Book b = map.get(key);
			
			System.out.println(key + "=" + b);
		}
	}
	
	
}


//�� Ŭ���� ���� �ȿ� �������� Ŭ���� ���ǰ���
//���������ڴ� 1���� Ŭ�������� ���� �� �ִ�
//default

class Book{
	private String title;
	
	public Book() {}
	public Book(String title) {
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call...");
	}
	@Override
	public String toString() {
		return "Book";
	}
	
}


class Student{
	public Student() {}
	
	public void score() {
		System.out.println("score() call....");
	}
	@Override
	public String toString() {
		return "Student";
	}
	
	
}

class Car{
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call...");
	}
	@Override
	public String toString() {
		return "Car";
	}
}














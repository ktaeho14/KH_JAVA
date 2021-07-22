package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("�ڹ��� ����","���ȣ",10000);
		Book b2 = new Book("c����� ����","����ȣ",15000);

		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println(b1.equals(b2));
		
		
		//���� ����
		Book b3 = b1;
		Book b4 = b2;
		
		//���� ����
		
		Book b5 = new Book("�ڹ��� ����","���ȣ",10000).clone;
		Book b6 = new Book("c����� ����","����ȣ",15000).clone;
		
		//b1�� b3 , b2�� b4�� ����� �����°�??
		System.out.println("b1�� b3�� ����� �����°�?: " +b1.equals(b3));
		System.out.println("b2�� b4�� ����� �����°�?: " +b2.equals(b4));
		
		//b1�� b3�� ���ϼ��� �����°�?
		System.out.println("b1�� hashcode: " + b1.hashCode());
		System.out.println("b3�� hashcode: " + b3.hashCode());
		//b2�� b4�� ���ϼ��� �����°�?
		System.out.println("b2�� hashcode: " + b2.hashCode());
		System.out.println("b4�� hashcode: " + b4.hashCode());
	}

}

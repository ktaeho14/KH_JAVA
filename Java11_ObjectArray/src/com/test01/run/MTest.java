package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class MTest {
	public static void main(String[] args) {
		Book bk1 = new Book("�ڹ�������", "ȫ�浿","����",10000);
		Book bk2 = new Book("C���", "��â��","KH",20000);
		Book bk3 = new Book("���α׷���","���ȣ","����Ŭ����",30000);
		
		//���
		System.out.println(bk1.prn());
		System.out.println(bk2.prn());
		System.out.println(bk3.prn());
	
		// ���� �˻�
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� å ����: ");
		String searchTitle = sc.nextLine();
	
		if(bk1.getTitle().equals(searchTitle)) {
			System.out.println(bk1.prn());
		}else if(bk2.getTitle().equals(searchTitle)) {
			System.out.println(bk2.prn());
		}else if(bk3.getTitle().equals(searchTitle)) {
			System.out.println(bk3.prn());
		}
		
		
		
		
		
		
	}
}

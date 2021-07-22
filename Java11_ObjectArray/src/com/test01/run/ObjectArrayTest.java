package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class ObjectArrayTest {
	public static void main(String[] args) {
		//1. �⺻�ڷ��� �迪
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		
		//ctrl + space
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
	
		//2.��ü�迭
		//Ŭ������[] ������ = new Ŭ������[]
		
		//���� �� �Ҵ�
		Book[] bk = new Book[3];
		
		//�ʱ�ȭ
		bk[0] = new Book("�ڹ��� ����", "ȫ�浿", "����", 10000);
		bk[1] = new Book("C����� ����", "��â��", "KH", 20000);
		bk[2] = new Book("���α׷���","���ȣ","���̿���ġ",30000);
	
		//System.out.println(bk);
		//System.out.println(bk[0]);
		//System.out.println(bk[0].getPrice());
		
		//bk      			   =>Book[]      (�ּҰ�)
		//bk[index] 		   => Book ��ü	 (�ּҰ�)
		//bk[index].getPrice() => int		 (������)
		
		System.out.println("���� ����: " + bk.length);
		
		//������ ���
		//System.out.println(bk[0].prn());
		//System.out.println(bk[1].prn());
		//System.out.println(bk[2].prn());
		
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].prn());
		}
		
		//���� �˻�
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� ������ �Է��ϼ���: ");
		String searchTitle = sc.nextLine();
		
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().equals(searchTitle)) {
				System.out.println(bk[i].prn());
			}
		
		
		}
	}
}

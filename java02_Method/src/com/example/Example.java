package com.example;

import java.util.Scanner;

public class Example {
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ����: ");
		int no1 = sc.nextInt();
		System.out.println("�ι�° ����: ");
		int no2 = sc.nextInt();
		
		System.out.println(no1+no2);
		System.out.println(no1-no2);
		System.out.println(no1*no2);
		System.out.println(no1/no2);
		System.out.println(no1%no2);
	
	
	
	}
	
	
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("����: ");
		Double width = sc.nextDouble();
		System.out.println("����: ");
		Double height = sc.nextDouble();
		
		System.out.println("����: " + (width*height));
		System.out.println("�ѷ��� " + (width+height)*2);
	
	
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���: ");
		String str = sc.next();
		
		System.out.println("ù��°: "+str.charAt(0));
		System.out.println("�ι�°: "+str.charAt(1));
		System.out.println("����°: "+str.charAt(2));
	}
	
	
	
	
}

package com.test01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		//WhileTest02.testDoWhile();
		WhileTest02.testDoWhile2();
		
		
	}
	public static void testDoWhile() {
		int i = 10;
		
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		System.out.println("do while ���� �� i: " + i);
		
		
		
		
	}
	
	public static void testDoWhile2() {
		//"end"��� ���ڿ��� �Է��Ҷ� ���� �ݺ�
		//ctrl + shift + m : import
		//ctrl + shift + o : ������ �� ��� import
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		do {
			System.out.println("���ڿ� �Է�: ");
			str = sc.next();
			if(str.equals("end")) {
				break;
			}
			System.out.println("str: " + str);
			
		}while(true);
		
	}
	
	
	
	
	
	
}

package com.test01;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		//WhileTest01.testWhile();
		//WhileTest01.testWhile2();
		//WhileTest01.testWhile3();
		//WhileTest01.testWhile4();
		WhileTest01.testWhile4_2();
		
		
	}
	
	public static void testWhile() {
		int i = 1;
		while(i<10) {
			System.out.println(i+" ��°!");
			i++;
		}
	
	
	}
	public static void testWhile2() {
		//���ڿ��� �Է� �޾� �ε��� ���� ���ڸ� ���
		String str = "changjin";
		int index = 0;
		
		
		while(index < str.length() ) {
			char ch =str.charAt(index);
			System.out.println(index + " : " + ch);
			index++;
			
		}
		
		
		
		
	}
	
	
	public static void testWhile3() {
		//1���� �Է¹��� �� ������ �������� ��
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("���� �ϳ� �Է�");
		int num = sc.nextInt();
		
		int i = 1;
			
		while(i <= num) {
			sum += i;
			
			i++;
		}
		System.out.println("sum: " + sum);
	}
	
	
	
	public static void testWhile4() {
		int  i =1;
		
		while(true) {
			System.out.println(i);
			i++;
			
			if(i==10) {
				break;	
		}
		
	}
		
		
		
		
		
		
		
	}
	
	public static void testWhile4_2() {
		//Ű����� 4�� �Է� ������ ���� �ݺ�,
		//4�� �ԷµǸ� while�� ����.
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("�����Է�[1~10]: ");
			int no = sc.nextInt();
			
			
			if(no==4) {
				System.out.println("4�Է�!!! ����!!");
				break;
			}
		}
		
		
		
		
		
		
	}
	
	
	
}

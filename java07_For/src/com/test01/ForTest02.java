package com.test01;

import java.util.Scanner;

public class ForTest02 {
	public static void main(String[] args) {
		//ForTest02.testFor1();
		ForTest02.testFor2();
		//ForTest02.testFor3();
		//ForTest02.testFor4();
		//ForTest02.testFor5();
	}
	
	public static void testFor1() {
		for(int i=0; i<10; i++) {
			System.out.println("�ݺ�" + i);
			
			for(int j=0; j<10 ;j++ ) {
				System.out.println("i: " + i +", j: " + j);
			}
			System.out.println();
			
		}
		
		
		
	}
	
	public static void testFor2() {
		//�������� 2�ܺ��� 9�ܱ��� ���
		
		for(int dan =2; dan<10; dan++) {
			System.out.println(dan+"��");
		
			for(int su =1; su<10; su++) {
				System.out.println(dan+" * " +su +" =" + (dan*su));
			}System.out.println();
		
		
		}
	}
	

	public static void testFor3() {
	/*
	 	*****
	 	*****
	 	*****
	 */
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����? ");
		int row = sc.nextInt();
		System.out.println("��ĭ? ");
		int col = sc.nextInt();
	
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("^");
			}
			System.out.println();
		}
		
		
	
	}
	
	public static void testFor4() {
		//�� �ٿ� ��ǥ ���ڸ� �Էµ� �ټ��� ĭ����ŭ ���
		/*
		 *  1**** 0,0
		 *  *2*** 1,1
		 *  **3** 2,2
		 *  ***4* 3,3
		 *  ****5 4,4
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���");
		int a = sc.nextInt();
		System.out.println("ĭ ���� �Է��ϼ���");
		int b = sc.nextInt();
		
		for(int i =0; i<a; i++) {
			for(int  j = 0; j<b; j++) {
				if(i==j) {
					System.out.print(i+1);
				}else {
					System.out.print("*");
				}
				
				
			}
			System.out.println();
		}
		
		
	}
	
	public static void testFor5() {
		//�� �ٿ� ��ǥ ���ڸ� �Էµ� �ټ��� ĭ����ŭ ���
		/*
		 *  1**** 0,0
		 *  *2*** 1,1
		 *  **3** 2,2
		 *  ***4* 3,3
		 *  ****5 4,4
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���");
		int a = sc.nextInt();
		System.out.println("ĭ ���� �Է��ϼ���");
		int b = sc.nextInt();
		
		if(a<0) {
			System.out.println("����� �ƴմϴ�");
			
		}else if(b<0) {
			System.out.println("����� �ƴմϴ�");
		}else {
		for(int i =0; i<a; i++) {
			for(int  j = 0; j<b; j++) {
				if(i==j) {
					System.out.print(i+1);
				}else if(i>j) {
					System.out.print("*");
				}
				
			}System.out.println();
			}
			
		}
		
		
	}
}
	
	
	


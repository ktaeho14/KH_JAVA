package com.Example2;

import java.util.Scanner;

public class Example2 {

		public void example4() {
			
			System.out.println("�� ���� ������ �Է��ϼ���");
			Scanner sc = new Scanner(System.in);
			int no3 = sc.nextInt();
			int no4 = sc.nextInt();
			
			System.out.println("�� ���� ��: "+(no3+no4));
			System.out.println("�� ���� ��: "+(no3-no4));
			System.out.println("�� ���� ��: "+(no3*no4));
			System.out.println("�� ���� ��: "+(no3/no4));
			System.out.println("�� ���� ������: "+(no3%no4));
			
		}
		
		public void example5() {
		
		System.out.println("�� �Ǽ��� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		double no5 = sc.nextDouble();
		double no6 = sc.nextDouble();
		
		
		System.out.println("����: "+(no5*no6));
		System.out.println("�ѷ�: "+(no5+no6)*2);
		
			
			
		}
		
		public void example6() {
			System.out.println("���ڿ��� �Է��ϼ���");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			
			System.out.println("ù��° ����: " +str.charAt(0));
			System.out.println("�ι�° ����: " +str.charAt(1));
			System.out.println("����° ����: "+str.charAt(2));
		}
		
		
		
}

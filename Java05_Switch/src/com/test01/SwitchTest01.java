package com.test01;

import java.util.Scanner;

public class SwitchTest01 {
	public void test() {
		
		int i=2;
		
		switch(i) {
		case 1:
			System.out.println("1�Դϴ�");
			break;
			
		case 2:
			System.out.println("2�Դϴ�");
			break;
			
		case 3:
			System.out.println("3�Դϴ�");
			break;
			
		default:
			System.out.println("1,2,3 ��� �ƴմϴ�, �ٸ� �����Դϴ�");
			
			
			
		}
		
	}


	public void test2() {
		char ch = 'f';
		
		switch(ch) {
		
		case 'a':
			System.out.println("a�Դϴ�");
			
			break;
		case 'b':
			System.out.println("b�Դϴ�");
			break;
		
		case 'c':
			System.out.println("c�Դϴ�");
			break;
			default:
				System.out.println("�ƹ��͵� �ƴմϴ�.");
		}
		
	}
	
	
	public void test3() {
		int i = 1;
		
		
		switch(i) {
		
		case 1:
		case 3:
			System.out.println("Ȧ���Դϴ�");
			break;
		case 4:
			System.out.println("4�Դϴ�");
		case 2:
			System.out.println("¦���Դϴ�");
			break;
		default:
			System.out.println("�ٸ� ���� �Դϴ�");
		}
	}

	
	
	
		public void test4() {
			String s = "�ѱ�";
			
			switch(s) {
			
			
			case "�ѱ�":
				System.out.println("korea");
			
				break;
			
			case "����":
				System.out.println("UK");
			
				break;
			
			case "�̱�":
				System.out.println("USA");
				break;
				
			default:
				System.out.println("�ٸ� ���� �Դϴ�");
			
			
			
			
			}
			
			
			
		}
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� �Է�");
		int month = sc.nextInt();
		
		
		switch(month) {
		
		case 1:	
		case 2:
		case 12:
			System.out.println("�ܿ�");
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
			
		default:
			System.out.println("�ش� �ϴ� ������ �����ϴ�");
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}

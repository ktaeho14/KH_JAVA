package com.test01;

import java.util.Scanner;

public class ForTest01 {
	public static void main(String[] args) {
		//ForTest01.testFor();
		//ForTest01.testFor2();
		//ForTest01.testFor3();
		//ForTest01.testFor4();
		//ForTest01.testFor5();
		//ForTest01.testFor6();
	}
	
	public static void testFor() {
		//0~10��� for(�ʱ��; ���ǽ�; ������){}
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	
	public static void testFor2() {
		//����
		
		for(int i = 100; i>=1; i--) {
			
			if(i%10 == 0) {
			System.out.println();
		}
			System.out.print(i+" ");
	}
}
	
	public static void testFor3() {
		//�������� �ݵ�� 1�� ������ �ʿ� ����
		for(int i = 1; i<10; i+=2) {
			System.out.println(i);
		}
		
		//�ʱ�İ� �������� 1�� �̻� ���� ����
		for(int i=0,j=10; i<10 && j>0; i++,j--) {
			System.out.println(i+" : " + j);
		}
		//int�� �ƴ� char�� Ȱ���ϸ�?
		for(char ch= 'a'; ch<='z'; ch++) {
			System.out.println(ch);
		}
		
	
	}
	
	
	
	public static void testFor4() {
		//���� �ϳ��� �Է� �޾� �� ���� ��� �϶��� �� ���� �������� ���
		//����� �ƴϸ� "�ݵ�� 1~9 ������  ����� �Է��ϼ���!" ���
		System.out.print("�����ϳ��� �Է�[1~9]");
	
		int dan = new Scanner(System.in).nextInt();
		
		if(dan >=1 && dan<=9) {
			for(int i = 1; i<10; i++) {
				System.out.println(dan + " * " +  i + " = " + (dan*i));
			}
			
			
		}else {
			System.out.println("�ݵ�� 1~9������ ����� �Է��ϼ���!");
		}
		
	
		
		
		
		
		
	}
	public static void testFor5(){
	//1���� 100������ ���� �� ������ ������ ����
	//1~���������� �հ踦 ���Ͽ� ���
	int random = (int)(Math.random()*100)+1;	
		
	int sum = 0;
	for(int i =1; i<=random; i++) {
		sum += i;
		
		}
	System.out.println("1���� " + random + "���� �������� �հ�" + sum);
	
	}
	
	/*public static void testFor6() {
		//���� �ΰ� �Է� ��
		//������ ~ ū�� ������ ��
		System.out.println("�ΰ��� ������ �Է�");
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		int sum = 0;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			for(;a>b;b++) {
				sum += a+b;
			}
			System.out.println("a�� b���� Ŭ���"+ sum);
		}else {
			for(;a<b;a++) {
				sum += a+b;
				
			}
		}System.out.println("b��a���� Ŭ���"+sum);
		
		
	}
	*/
	public static void testFor6() {
		//���� �ΰ� �Է� ��
		//������ ~ ū�� ������ ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ����: ");
		int num2 = sc.nextInt();
		
		int sum = 0, max, min;
		
		
		
		if(num1>num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}System.out.println(min + "����" + max + "������ �������� �� : " + sum);
		
		
		
		
		
		
		
		
		
	}
	
}
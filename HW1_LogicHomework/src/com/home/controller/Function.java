package com.home.controller;

import java.util.Scanner;

public class Function {
//�޴����� �����ų �޼ҵ���� �ۼ��� : ��� non-static �޼ҵ�� �ۼ��� ��
//	=> Ű���� �Է��� ���� Scanner Ŭ������ ���� ���۷��� ������ �ʵ�� ������
	public void calculator() {
		System.out.println("���� �� ���� ���깮�� �Ѱ��� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		
		case '+':
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			break;
		case 'X':
		case 'x' :
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
			break;
		
		case '/' :
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			if(num2==0) {
				System.out.println("0���� ���� �� �����ϴ�");
			}
			break;
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
	
	}
	
	public void totalCalculator() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ΰ��� �Է��ϼ���");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum1 = 0;
		
		if(num2>=num1) {
		for(int i = num1; i<=num2; i++) {
			sum1 += i;
			System.out.print(i+"+");
		}
		System.out.println("\n"+num1+"����"+num2+"������ �հ�"+"="+sum1);
			
		}else if(num1>=num2) {
			for(int j=num2; j<=num1; j++) {
				sum1 += j;
				System.out.print(j+"+");
			}System.out.println("\n"+num2+"����"+num1+"������ �հ�"+"="+sum1);
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	/*public void totalCalculator() {
		System.out.println("���� �ΰ��� �Է��ϼ���");
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		
		if(num2<num1){
		for(int i = 0; i<=num1; i++) {
			sum += i;
			}
		}else if(num1<num2) {
			for(int i = 0; i<=num2; i++) {
				sum += i;
		}
	}
		System.out.println(sum);
		
		
		
		
		
		
		
		
	}
	*/
	public void profile() {
		String name = "ȫ�浿";
		
		int age = 26;
		
		String sex = "����";
		
		String per = "��������";
		
		System.out.println("�̸�: "  + name);
		
		System.out.println("����: " + age);
		
		System.out.println("���� : " + sex);
		
		System.out.println("����: " + per);
	}
	
	
	public void sungjuk() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�, �г�, ��, ��ȣ, ����(M or F) ������ ��������Է����ּ���");
		
		String name = sc.nextLine();	//�̸�
		int sy = sc.nextInt();	//�г�
		int cl = sc.nextInt();	//��
		int num = sc.nextInt();	//��ȣ
		String sex2 = sc.next();	//����
		double gr = sc.nextDouble();	//����
		char cr = ' '; 	//����
		String gr2 = String.format("%.2f", gr);
		
		String m = "���л�";
		String f = "���л�";
		
				
		String sex = (sex2.charAt(0)== 'M' ? m  : f  );
		
		
		
		if(gr>=90.00) {
			cr='A';
		}else if(gr>=80 && gr<90) {
			cr='B';
		}else if(gr>=70 && gr<80) {
			cr='C';
		}else if(gr>=60 && gr<70) {
			cr='D';
		}else {
			cr='F';
		}
		
		System.out.printf(sy+"�г� "+cl+"�� "+num+"�� "+ sex+""+name+"�� ������ "+gr2+"�̰�, "+ cr+"�����Դϴ�.");
		
		
		
		
		
	}
	
	
	public void printStarNumber() {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println("����� �ƴմϴ�");
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i==j) {
					System.out.print(i+1);
				}else if(i>j) {
					System.out.print("*");
				}
			}System.out.println();
		}
		
		
		
	}
	
	public void sumRandomNumber() {
		int sum = 0;
		int num2 = (int)(Math.random()*100)+1;
		System.out.println("�߻��� ����" + num2);
		for(int i=0; i<num2; i++) {
			sum += i;
			System.out.println("1~�߻��ѳ��������� �� �ջ�"+sum);
		}
	}
	
	
	public void continueGugudan() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� ���ڸ� �Է����ּ���");
		
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=2;i<=num;i++) {
				for(int j=1;j<9;j++) {
					if(num==i) {
						System.out.println(i+"*"+j+"="+(i*j));
					
						continue;
					}
				}
			}
		}else {
			System.out.println("����� �ƴմϴ�");
		}
		
		
		
		
	}
	
	public void shutNumber() {
		Scanner sc = new Scanner(System.in);
		
		
		
		int num1 =0;
		int num2 =0;
		
		int sum2 = 0;
		char ch =' '; 		
		do {
			System.out.println("�� �ֻ����� ���� ������ ���� �Է��ϼ���: ");
			sum2 =sc.nextInt();
			num1 = (int)(Math.random()*6)+1;
			num2 = (int)(Math.random()*6)+1;
			int sum = num1 + num2;
			System.out.println("ù��° �ֻ���: "+ num1);
			System.out.println("�ι�° �ֻ���: " +num2);
			
			if(sum==sum2) {
				System.out.println("������ϴ�");
				System.out.println("��� �Ͻðڽ��ϱ�?(y/n): ");
				ch = sc.next().charAt(0);
				if(ch=='n') {
					System.out.println("���α׷��� �����մϴ�");
						break;
				}else if(ch=='N') {
					System.out.println("���α׷��� �����մϴ�");
					break;
				}
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�");
			
			}
			
			
			
			
		}while(true);
		
	}
	
}

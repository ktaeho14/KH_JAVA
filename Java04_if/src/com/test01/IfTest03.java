package com.test01;

import java.util.Scanner;

public class IfTest03 {
	//else if ���� ������ �� �� �ִ� ����
	
	
	public void test() {
		int i = 30;
		int j = 20;
		
		if(i>j) {
			System.out.println(i + "��" + j + "���� Ů�ϴ�.");
		}else if(i==j) {
			System.out.println(i + "��" + j + "�� �����ϴ�.");
		}else {
			System.out.println(i + "��" + j + "���� �۽��ϴ�.");
		}
		
	}
	
	public void test2() {
	//���� �ϳ� �Է� �޾� ����� ������ ������ ����� ����Ͻÿ�.
		//����� 90�� �̻��� A ���
		//90�� �̸� 80�� �̻��� B���
		//80�� �̸� 70�� �̻��� C ���
		//70�� �̸� 60�� �̻��� D ���
		//60�� �̸��� F ������� ������.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		
		int score = sc.nextInt();
		String grade = "";
		
		/*
		if(score>=90) {
			System.out.println(score + ": A���");
		}else if(score>=80) {
			System.out.println(score + ": B���");
		}else if(score>=70) {
			System.out.println(score + ": C���");
		}else if(score>=60) {
			System.out.println(score + ": D���");
		}else {
			System.out.println(score + ": F���");
		}
		*/
		
		if(score>=90) {
			grade = "A";
		}else if(score < 90 && score >= 80) {
			grade = "B";
		}else if(score < 80 && score >= 80) {
			grade = "C";
		}else if(score < 70 && score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.printf("����� ������%d �̰�, �����%s�Դϴ�.", score,grade);
		System.out.println("�׽�Ʈ~~~");
		//printf("%����",��);
		
		//���˹���
		//%d: ����
		//%o: 8����
		//%x: 16����
		//%f: �Ǽ�
		//%c: ����
		//%s: ���ڿ�
		//%b: ����
		
		//5d: 5ĭ�� Ȯ���ϰ� ������ ����
		//-5d: 5ĭ�� Ȯ���ϰ� ���� ����
		
		//Ư������
		//tap: \t
		//new line: \n
		//��������ǥ: \'
		//ū����ǥ: \"
		//��������: \\
	}
	
	public void test3() {
		//test2���� ��޺� �߰� ���� �̻��� ��쿡��
		//��޿� "+"��� ���ڸ� �߰��Ͽ� ����ϼ���
		//��) 95�� �̻��� ����� A+ ��� �ǰ� ��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		
		int score = sc.nextInt();
		String grade = "";
	
		if(score>=90) {
			grade = "A";
			if(score>=95) {
				grade += "+";
			}
		}else if(score < 90 && score >= 80) {
			grade = "B";
			if(score>=85) {
				grade += "+";
			}
		}else if(score < 80 && score >= 70) {
			grade = "C";
			if(score>75) {
				grade += "+";
			}
		}else if(score < 70 && score >= 60) {
			grade += "D";
			if(score>=65) {
				grade += "+";
			}
		}else {
			grade = "F";
		}
		
		System.out.printf("����� ������%d �̰�, �����%s�Դϴ�.", score,grade);
		
		
		
		
	}
	
	
	
	
	
	
	
}

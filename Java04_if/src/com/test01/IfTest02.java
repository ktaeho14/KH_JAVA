package com.test01;

import java.util.Scanner;

public class IfTest02 {
	//if else��
	//�� �� �Ѱ��� �����ϴ� ���ǹ�,
	//������ ���� ���� ������ ��� �����ϴ� ����� ���� �ۼ�
	
	
	public void test() {
		int i = 21;
		
		if(i%2 == 0) {
			//������ ���� �� ������ ����
			System.out.println(i+"�� ¦����!");
		}else{
			//������ ������ �� ������ ����
			System.out.println(i+"�� Ȧ����!");
		}
		
	}
	
	public void test2() {
		//Ű����� ���� �ϳ��� �Է� �޾�
		//50���� ū�����,¦������ Ȧ������ ��� "50���� ū ��"
		//50���� ������ "50���� ���� ��"��� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0����  ū ���� �Է�");
		
		int no = sc.nextInt();
		
		if(no>=50) {
			if(no%2 == 0) {
				System.out.println("50���� ū ¦��");
			}else {
				System.out.println("50���� ū Ȧ��");
			}
		}else {
			System.out.println("50���� ���� ��");
		}
		
	}
	
	public void test3() {
		//���ڸ� �ϳ� �Է� �޾� ������� �������� ���
		//��, 0�̸� "0�Դϴ�"��� ���
		
		//�������� Ǭ��
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0�Դϴ�");
		}else {
			if(num>0) {
				System.out.println("����Դϴ�");
			}else {
				System.out.println("�����Դϴ�");
			}
		}
		/* ����Ǭ��
		 
		if(num>0) {
			System.out.println("����Դϴ�");
		}if(num==0){
			System.out.println("0�Դϴ�");
		}else if(num<0) {
			System.out.println("�����Դϴ�");
		}
		*/
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

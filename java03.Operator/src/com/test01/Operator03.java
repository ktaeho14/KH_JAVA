package com.test01;

import java.util.Scanner;

public class Operator03 {
	public static void main(String[]args) {
		Operator03 ot = new Operator03();
		ot.opTest();
		
		
		
	}
	
	public void opTest() {
		//���� �ϳ��� Ű����� �Է� �޾� 1~100������ �������� Ȯ��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է�");
		int num = sc.nextInt();
		
		System.out.println("1~100 Ȯ��: " + (num>=1 && num<=100));
	
		//Ű����� ���� ���� �ϳ��� �Է� �޾� ���� �빮������ Ȯ��
		//'A' ~ 'Z' => ����>='A' && ����<='Z'
		
		System.out.println("���� �ϳ� �Է�: ");
		char ch = sc.next().charAt(0);
		//String���� ������ ���Ŀ� charAt���� �ٽ� �����;��Ѵ�
		
		System.out.println("�빮�� Ȯ��:" + (ch>='A' && ch<='Z'));
		
		System.out.println("���� �ϳ� �Է�");
		char sch = sc.next().charAt(0);
		System.out.println("�ҹ��� Ȯ��" + (sch>='a' && sch<='z'));
	
		System.out.println(Character.isUpperCase(ch));
	
		//�Է��� ���ڰ� ��ҹ��� ������� 'y' 'Y' ���� ��� ��
		System.out.print("��� �Ͻ÷��� y/Y�� �Է��ϼ���");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("������ y���� Ȯ��: " + (ch2=='y' || ch2=='Y'));
	
	
	}
	
	
	
	
}

package com.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable03 {
	//java.io ��Ű������ �����Ǵ� Ŭ�������� �̿�
	public static void main(String[] args) {
		//Ŭ������ ������ = new Ŭ������();
		Variable03 test = new Variable03();
		//test.input1();
		
		test.input2();
		
		
	}
	public void input1() {
		//���� ��ġ�� ��Ű�� ���� �ٸ� ��Ű���� ���� Ŭ������ ����� �� import�� ����� �Ѵ�.(�ҷ��;��Ѵ�)
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.print("���� �� �� �Է�: ");
		 
		 try {
			 
			 String value = br.readLine();
		 
			 //System.out.println(value*3);	
			 int number = Integer.parseInt(value);
			 System.out.println(number*3);
			 
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	
	
	}
	public void input2() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		//���ٷ� ��ü�� �о���� �ʹ� ��� nextLine�� ����Ѵ�
		
		System.out.print("����: ");
		int age = sc.nextInt();
		
		System.out.print("�÷�: ");
		double eyesight = sc.nextDouble();
		
		System.out.println(name+":"+age+" : " + eyesight);
	}
	
	
	
	
	
}

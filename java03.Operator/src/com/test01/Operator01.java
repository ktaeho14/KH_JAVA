package com.test01;

public class Operator01 {
	public static void main(String[] args) {
		//static Method ȣ��
		// Ŭ������.�޼ҵ��();
		//Operator01.testMethod();
		Operator01.testMethod2();
	}
	// !���� :  ������ �ݴ�� �ٲٴ� ������
	// !true => false, !false => true
	
	public static void testMethod() {
		System.out.println("true�� ����: " + !true);
		System.out.println("false�� ����: " + !false);
	
	
		boolean flag =true;
		System.out.println("flag�� ����: " + !flag);
		System.out.println("flag: " + flag);
	
	}
	
	//����������: ����,����
	//++ : 1����,		++��, ��++ �� ���
	//-- : 1����		--��, ��-- �� ���
	public static void testMethod2() {
		int age = 20;
		
		System.out.println("���� ���̴�?: " + age);
		
		++age;
		System.out.println("++age�� �����?" + age);
		
		age++;
		System.out.println("age++�� �����?" + age);
		
		--age;
		System.out.println("--�� �����?" + age);
		
		age--;
		System.out.println("age--�� �����?" + age);
	
		System.out.println("=================");
		
		int num1 = 20;
		
		int res = num1++ *3;
		//res�� num1�� ���� Ȯ��
		
		System.out.println(res+":"+num1);
		
		int num2 = 20;
		
		int res2 = ++num2 *3;
		
		System.out.println(res2+":"+num2);
		
	}
	
	
	
	
	
	
}

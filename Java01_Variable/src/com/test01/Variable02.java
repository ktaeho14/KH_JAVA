package com.test01;

public class Variable02 {
	
	public static void main(String[] args) {
		//���
		int age;
		final int AGE; 
		
		age = 19;
		AGE = 19;
		
		//���
		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);
	
		//������ �� ����
		age = 30;
		//AGE = 30;
		//���� �߻�, ����� ���� �Ұ�
		
		System.out.println("���� ��age: " + age);
		System.out.println("���� ��AGE: " + AGE);
		System.out.println("��� ���� �ѹ� ��� �� ������ �Ұ���");
	}

}

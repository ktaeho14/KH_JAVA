package com.test.chap05_method;

public class MethodTest {
	//1. �Ű����� ���� ��ȯ�� ���� �޼ҵ�
	public void method1() {
		System.out.println("�Ű������� ��ȯ���� �Ѵ� ���� �޼ҵ�");
		return;
	}
	
	//2. �Ű����� ���� ��ȯ���� �ִ� �޼ҵ�
	public String method2() {
		
		return "�Ű������� ������ ��ȯ���� �ִ� �޼ҵ�";
	}
	
	//3. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("sum: " + sum);
		
		
		return;
	}
	
	//4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
		
		return num1+num2;
	}
	
	
	
}

package com.test.chap05_method;

public class MethodTest2 {
	//static �޼ҵ�
	
	//1.�Ű������� ���ϰ��� ���� �޼ҵ�
	public static void sMethod1() {
		int num1 = 10;
		int num2 = 20;
		System.out.println("10�� 20�� ����: " + (num1 + num2)+"�Դϴ�");
	}
	
	
	//2.�Ű����������� ���ϰ��� �ִ� �޼ҵ�
	public static int sMethod2() {
		int num1 = 10;
		int num2 = 20;
		
		return num1 + num2;
	}
	
	//3.�Ű������� �ְ� ���ϰ��� ���� �޼ҵ�
	public static void sMethod3(String name) {
		System.out.println(name + "���� �湮�� ȯ���մϴ�");
	}
	
	
	//4.�Ű������� �ְ� ���ϰ��� �ִ� �޼ҵ�
	public static String sMethod4(String name) {
		return name+"���� �湮�� ȯ���մϴ�";
	}
	
	
	
	
	
	
	
}

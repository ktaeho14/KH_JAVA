package com.test01;
	//���� ������
public class MethodTest01 {
	public static void main(String[] args) {
		//Ŭ������.�޼ҵ��();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		MethodTest01.privateMethod();
		
		
		MethodTest01 mt01 = new MethodTest01();
		mt01.NonStaticMethod();
	}
	
	
	//public�ǹ� ��𼭳� ����,���� ����( + )
	public static void publicMethod() {
		System.out.println("public method");
	}

	//����� ��� ��ӵ� ������ ( # )
	//����� �ƴ� ��� ���� ��Ű�� ������
	protected static void protectedMethod() {
		System.out.println("protcted method");
	}
	
	//���� ��Ű�� ������(defalut)
	static void defaultMethod() {
		System.out.println("defalut method");
	}
	
	//���� Ŭ���� �������� ( - )
	private static void privateMethod() {
		System.out.println("private method");
		
		MethodTest01.defaultMethod();
		
	}
	
	
	public void NonStaticMethod() {
		System.out.println("non static method");
	}
	
	
	
	
	
	
	
	
	
}


package com.chap03_myException.exception;

public class MyException extends Exception {
	public MyException() {
		System.out.println("�������� ����Ŭ����!");
		
	}
	
	public MyException(String msg) {
		super(msg);
	}
	
	
	
	
	
}

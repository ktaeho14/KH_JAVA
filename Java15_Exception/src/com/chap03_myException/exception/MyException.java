package com.chap03_myException.exception;

public class MyException extends Exception {
	public MyException() {
		System.out.println("내가만든 예외클래스!");
		
	}
	
	public MyException(String msg) {
		super(msg);
	}
	
	
	
	
	
}

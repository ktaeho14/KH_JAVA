package com.chap01_throws;

import java.io.IOException;

public class Run {

	public static void main(String[] args) /* throws IOException */{
		try {
		methodA();
		System.out.println("main�� try");
		}catch(IOException e) {
			System.out.println("main()���� ó��");
		}
		
		System.out.println("���ƾƾƾƾƾƾ�");
		
		//
		
		
		
		
		
	}
	
	
	public static void methodA() throws IOException {
		
		
		methodB();
		
		}
	
	public static void methodB() throws IOException {
		
		methodC();
		
	}
	
	public static void methodC() throws IOException {
		throw new IOException();
		
	}
	
	
	
	
}

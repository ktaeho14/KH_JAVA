package com.chap03_myException.run;

import java.util.Scanner;

import com.chap03_myException.exception.MyException;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է�: ");
		int no = sc.nextInt();
		
		try {
		checkNum(no);
		}catch(MyException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	
	
	}
	
	public static void checkNum(int num) throws MyException {
		if(num<10) {
//			MyException me = new MyException();
//			throw me;
			throw new MyException(num + "��10���� �������ڳ�!!!!!");
		}else {
			System.out.println(num + "�� 10���� ũ�ų� ������~");
		}
		
		
		
		
	}
	
}

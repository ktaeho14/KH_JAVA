package com.test01;

public class Operator05 {
//������� ������(���մ��Կ�����)	//+=, -=, *= ,/=, %=
	public static void main(String [] args) {
		int num = 12;
		
		System.out.println("num: " + num);
		
		num = num+3;
		System.out.println("num: " + num);
		
		num += 3;
		System.out.println("num: " + num);
				
		num -= 5; //num = num-5
		System.out.println("num: " + num);
		
		num *= 2; //num�� 2�� ����
		System.out.println("num: " + num);
		
		num /= 2; //num�� 2�� ����
		System.out.println("num: " + num);
		
		num %= 5; //num = num % 5
		System.out.println("num: " + num);
	}
	
	
	
}

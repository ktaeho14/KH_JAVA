package com.test01;

public class Operator02 {
	public static void main(String[] args) {
		Operator02 ot = new Operator02();
		ot.opTest();
		ot.opTest2();
		
		//new Operator02.optest2();
		
	}
	public void opTest() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
	
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
	
	}
	
	/*
	 * �� ������
	 * �� �����ڴ� ������ �����ϸ� true, �������� ���ϸ� false
	 * 
	 * < 	, a<b 	a�� b���� ������?
	 * > 	, a>b 	a�� b���� ū��?
	 * == 	, a==b	a��b�� ������?
	 * != 	, a!=b	a��b�� �ٸ���?
	 * <=	, a<=b	a�� b���� �۰ų� ������?
	 * >=	, a>=b	a�� b���� ũ�ų� ������?
	 */
	
	public void opTest2() {
		int a = 10, b=20;
		boolean res1, res2, res3;
		res1 = (a == b);
		res2 = (a <= b);
		res3 = (a > b);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}






}


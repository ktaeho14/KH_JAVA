package com.poly.part01.test06;

import java.util.Scanner;

public class Square extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int x = sc.nextInt();
		System.out.println("���� �Է�: ");
		int y = sc.nextInt();
		
		int res = x* y;
		
		super.setResult(String.valueOf(res));
		
		
	}
	
	@Override
	public void print() {
		System.out.println("�簢���� ");
		super.print();
	}

}

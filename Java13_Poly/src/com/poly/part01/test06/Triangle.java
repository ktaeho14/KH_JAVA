package com.poly.part01.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�غ��� �Է�: ");
		int x = sc.nextInt();
		
		System.out.println("���̸� �Է�: ");
		int h = sc.nextInt();
		
		double res = (double)x * h /2;
		
		super.setResult(String.format("�ﰢ���� %.2f", res));
		
	}
	

}

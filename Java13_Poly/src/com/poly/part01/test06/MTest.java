package com.poly.part01.test06;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����[1:�� 2:�簢�� 3:�ﰢ��]");
		
		int select = sc.nextInt();
		
		Area ar = null;
		
		
		switch(select) {
		case 1:
			ar = new Circle();
			break;
		case 2:
			ar = new Square();
			break;
		case 3:
			ar = new Triangle();
			break;
		}
		
		ar.make();
		ar.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

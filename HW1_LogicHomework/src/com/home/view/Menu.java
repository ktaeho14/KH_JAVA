package com.home.view;

import java.util.Scanner;

import com.home.controller.Function;

public class Menu {
	public static void displayMenu() {
		Function fu = new Function();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			System.out.println("1.���� ����");
			System.out.println("2.���������� ū������ �հ豸�ϱ�");
			System.out.println("3.�Ż����� Ȯ���ϱ�");
			System.out.println("4.�л����� Ȯ���ϱ�");
			System.out.println("5.���� ���� ����ϱ�");
			System.out.println("6.���������� �հ� ���ϱ�");
			System.out.println("7.������");
			System.out.println("8.�ֻ��� ���� �˾Ƹ��߱� ����");
			System.out.println("9.���α׷� ����");
			int num1 = sc.nextInt();
			
			switch(num1) {
			case 1: fu.calculator();
			break;
			
			case 2: fu.totalCalculator();
			break;
			
			case 3: fu.profile();
			break;
			
			case 4: fu.sungjuk();
			break;
			
			case 5: fu.printStarNumber();
			break;
			
			case 6: fu.sumRandomNumber();
			break;
			
			case 7: fu.continueGugudan();
			break;
			
			case 8: fu.shutNumber();
			break;
			
			
			
			
			}
			
			if(num1 ==9) {
				break;
			}
		
		
		}while(true);
		
			
		
		
		
		
		
	}
}

package com.test01;

import java.util.Arrays;

public class WhileTest03 {

		public static void main(String[] args) {
			//1. 1~100 ������ ���ڸ� �������� ���.
			//WhileTest03.prn01();
			
			//2. 1~100 ������ ������, 2�� ����� ���
			//WhileTest03.prn02();
			
			//3. 1~100������ ���� �� , 7�� ����� ������ �� ���� ���.
			WhileTest03.prn03();
			
			
		}
		
		
		
		public static void prn01() {
			//1. 1~100 ������ ���ڸ� �������� ���.
			int num = 100;
			
			while(num>0) {
				System.out.println("1~100�� ���ڸ��������� ���: " + num);
				num--;
			}
		
		}
		
		
		
		
		
		
		public static void prn02() {
			//2. 1~100 ������ ������, 2�� ����� ���
			int num = 0;
			
			
			while(num<100) {
				num++;
				if((num%2)==0) {
					System.out.println("1~100�� 2�� ��� ���: " + num);
					
					
					
				}
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		public static void prn03() {
			//3. 1~100������ ���� �� , 7�� ����� ������ �� ���� ���.
			int num = 1;
			
			int cnt = 0;
			int sum= 0;
			
			while(num<=100) {
				if(num%7==0) {
					System.out.println(num+ " ");
					cnt++;
					sum+=num;
					
				}
				num++;
			}
			System.out.println();
			System.out.println(cnt + " : " + sum);
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
}

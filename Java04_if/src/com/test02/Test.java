package com.test02;



public class Test {
	public void test01(int num) {
		//1. �Է� ���� ���� 5�� ����̸� " 5�� ����Դϴ�."�� �������
		
		
		
		if(num%5 == 0) {
			System.out.println("5�� ����Դϴ�");
		}
		
		
		
		
	}
	
	public void test02(int num) {
		//2. �Է¹��� ���� 2�� ����̸鼭 3�� ����̸� "2�� 3�� ����Դϴ�."�� ���
		//	   �ƴ϶��, "2�� 3�� ����� �ƴմϴ�."�� �������.
		
				
		
		
		if( (num%2 ==0) && (num%3 == 0) ) {
			System.out.println("2�� 3�� ��� �Դϴ�");
		}else {
			System.out.println("2�� 3�� ����� �ƴմϴ�");
		}
		
		
	}
	
	public void test03(char a) {
		//3. �Է¹��� ���ڰ� �ҹ��ڶ�� "�ҹ����Դϴ�.", "�빮�ڶ�� "�빮���Դϴ�."�� �������
		// Charater class ���� �޼ҵ� ��� 
		
		if(Character.isUpperCase(a)){
			System.out.println("�빮�� �Դϴ�.");
		}else if(Character.isLowerCase(a)) {
				System.out.println("�ҹ����Դϴ�");
			
		}
		
		
		
		
		
		
		
	}
	
}

package com.test02;

public class TestMain {
	public static void main(String[] args) {
			//1. �Է� ���� ���� 5�� ����̸� " 5�� ����Դϴ�."�� ������� 
			new Test().test01(10);
		
		
			//2. �Է¹��� ���� 2�� ����̸鼭 3�� ����̸� "2�� 3�� ����Դϴ�."�� ���
			//	   �ƴ϶��, "2�� 3�� ����� �ƴմϴ�."�� �������.
			new Test().test02(6);
			//3. �Է¹��� ���ڰ� �ҹ��ڶ�� "�ҹ����Դϴ�.", "�빮�ڶ�� "�빮���Դϴ�."�� �������
			// Charater class ���� �޼ҵ� ��� 
			new Test().test03('A');
		
	}
}

package com.test01;

import java.util.Scanner;

public class IfTest01 {
	//�ܵ� if��
	//���ǽ��� ������� true�� { }�ȿ� �ִ� �ڵ带 ����,
	//���ǽ��� ������� false�� { }�ȿ� �ִ� �ڵ带 ����.
	
	public void testIf() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է�");
		int num = sc.nextInt();
	
		//¦������ ������ Ȯ����
		if(num%2 == 0) {
			//true �϶� ����
			System.out.println("�Է��Ͻ� ���ڴ� ¦��!!");
		} 
		
		//¦���� �ƴ��� ������ Ȯ�� �� �� 
		//������ ���̸�"Ȧ���Դϴ�!"��� ���
		if(num%2 != 0) {
			System.out.println("Ȧ�� �Դϴ�!!");
		}
		System.out.println("�޼ҵ� ����");
	
	}





}

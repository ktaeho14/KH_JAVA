package com.argument;

public class Mtest {

	public static void main(String[] args) {
		//main�� �Ű����� args�� �� ���� Ȯ��
		System.out.println("���ް� ����: " + args.length);
		
		for(int i = 0;i<args.length; i++) {
			System.out.println(i+ "��° ��: " + args[i]);
		}
		
		System.out.println(args[0] + args[1]);
		
		//parsing : �⺻�ڷ������� ����
		//���ڿ�->����
		int no1 = Integer.parseInt(args[0]);
		int no2 = Integer.parseInt(args[1]);
		
		System.out.println(no1+no2);
		
		System.out.println(Double.parseDouble(args[0]));
		
		
	}
	
	
	

}

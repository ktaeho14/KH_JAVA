package com.test.chap03_field.test01;


//���� ���� ��ġ�� ���� ����
public class FieldTest01 {//Ŭ���������� ����
	//�ʵ� == �������(Ŭ������ ������ ������ �ǹ�) == ��������(Ŭ���� �������� ��� ������ ����)
	private int globalNum;
	
	public void testMethod(int num) {//�޼ҵ念���� ����
		//��������
		int localNum;
		
		System.out.println(num);
		
		//System.out.println(localNum);
		
		
		
		System.out.println(globalNum);
		
		
	}//�޼ҵ念���� ��
	
	public void testMethod2() {
		//System.out.println(localNum);
		System.out.println(globalNum);
	}
	
	
	
	
	
	
	
}//Ŭ���������� ��

package com.test01;

public class Variable04 {
	public static void main(String[] args) {
		//�غ�
		Variable04 test = new Variable04();
		
		//����
		//test.printVarSize();
		test.testOverflow();
	}
	
	//������ ������ ��¿� �޼ҵ�
	public void printVarSize() {
		//����������
		System.out.println("byte�� ũ��: " + Byte.BYTES + "byte");
		System.out.println("short�� ũ��: " + Short.BYTES + "byte");
		System.out.println("int�� ũ��: " + Integer.BYTES + "byte");
		System.out.println("long�� ũ��: " + Long.BYTES + "byte");
	
		System.out.println("float�� ũ��:" + Float.BYTES + "byte");
		System.out.println("double�� ũ��: " + Double.BYTES + "byte");
		
		System.out.println("char�� ũ��: " + Character.BYTES + "byte");
	
	}

	public void testOverflow() {
		//byte : 127~ 128
		//byte bnum = 128; ����, ������ ��� ��
		
		byte bnum = 127;
		bnum = (byte)(bnum + 1);
		
		System.out.println("bnum " + bnum);
	}









}

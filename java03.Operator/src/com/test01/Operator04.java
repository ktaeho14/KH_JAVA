package com.test01;
import java.util.Scanner;
public class Operator04 {
	//���׿�����
	// (���ǽ�) ? ���϶� : �����϶�;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է�: ");
		int no = scan.nextInt();
		
		//String res = (no>0) ? "�����" : "����� �ƴϴ�";
		
		//(���ǽ�)? ���϶� : (���ǽ�)<���� ? ���϶� : �����϶�;
		String res = (no>0) ? "�����" : (no==0) ? "0�̴�" : "������";
		
		System.out.println(res);
		
		
		
		
		
	}
}

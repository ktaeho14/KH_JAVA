package com.test02;

public class Student {
	public static void main(String[] args) {
		String name = "��â��";
		int kor = 100;
		int eng = 84;
		int math = 40;
		
		
		//Ŭ������ ������ = new Ŭ������();
		Score sc = new Score();
		double avg = sc.getAvg(kor,eng, math);
		
		String res = sc.getGrade(avg);
		
		System.out.println(name+" ���� ����� "+res+"�Դϴ�");
		
	}
}

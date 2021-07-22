package com.chap04_wrapperClass;

public class Run {
	//boxing	: �⺻�ڷ��� + String�� Wrapper Ŭ������ �ٲٴ¹�
	//unboxing	: Wrapper Ŭ����  -> �⺻�ڷ���
	public static void main(String[] args) {
		
		//Boxing
		Integer i = new Integer(10);
		Integer i2 = new Integer(15);
		Double d = new Double(10.0);
		
		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i2));
		//0�� ���ؼ� ������, ����� i�� Ŭ��, ������ i2�� Ŭ��
		
		//AutoBoxing
		Short i3 = 10;
		Integer i4 = 5;
		Double d2 = 5.0;
		
		
		//UnBoxing
		int pi = i.intValue();
		double pd = d.doubleValue();
		
		//AutoUnBoxing
		int a = i;
		int b = i2;	//a+b =25(����)
		abox(a+b);	//int >> (autoBoxing)>> Integer >> (������) >> Object
		
		
		
		
	}
	
	public static void abox(Object obj) {
		System.out.println((Integer)obj);
	}
	
	
	

}

package com.test04;

public class MyCalc {

	public void sum(int i, int j) {
		int res = i+j;
		System.out.println(res);
	}
	
	public int sub(int i, int j) {
		int res = i - j;
		return res;
	}
	
	
	public double mul(double i, double j) {
		double res = i * j;
		return res;
	}
	
	//���� �ΰ��� �Ű������� �޾Ƽ�, �������� ��� �������� ���� ���� ����ϴ� �޼ҵ� div
	// '/' : ���� ���� ��
	// '%' : ���� ���� ������
	public void div(int i,int  j) {
		int div1 = i/j;
		int div2 = i%j;
		System.out.println(i+" / "+j+"�� ��: " + div1);
		System.out.println(i+" / "+j+"�� ������: " + div2);
	}
	
	
	
	
}

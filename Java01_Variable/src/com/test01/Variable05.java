package com.test01;

public class Variable05 {
	//����ȯ(cast)
	//�ڵ�����ȯ, ��������ȯ(���������ȯ)
	//		  (�ٲ��ڷ���)�� or (�ٲ��ڷ���)����
	
	public static void main(String[] args) {
		//�غ�
		Variable05 test = new Variable05();
		//����
		//test.rule1();
		//test.rule2();
		test.rule3();
	}
	
	
	public void rule1() {
		boolean flag = true;
		//����ȯ ����
		
		
		//�ڷ����� �ٸ����� ���� ũ���� ���� Ÿ���� ū ���� Ÿ������ ���� ����(�ڵ� ����ȯ, ���������ȯ,upcasting)
		//ū����Ÿ���� ��������Ÿ������ �ڵ�����ȯ ���� �ʱ� ������ ����ȯ�� ���(��������ȯ,���������ȯ,downcating)
		
		int num = 'a';
		System.out.println("num: " + num);
		
		char ch = 65;
		System.out.println("ch:" + ch);
		//char ch2 = -96; �������� ���� �Ұ���
		
		//int �ڷ��� ������ ���� ��������ȯ�� �ʿ�
		char ch2 = (char)num;
		System.out.println("ch2: " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3: " + ch3);
	}
	
	public void rule2(){
		
		int inum = 10;
		long lnum = 100;
		
		//int isum = inum + lnum;
		
		//���1.
		int isum =(int)(inum+lnum);
		System.out.println("isum:" + isum);
	
		//���2.
		int isum2 = inum + (int)lnum;
		System.out.println("isum2: " + isum2);
		
		//���3.
		long lsum = inum + lnum;
		System.out.println("lsum: " + lsum);
	}
	
	public void rule3() {
		long lnum = 100;
		
		float fnum = lnum;
		
		System.out.println("fnum: " + fnum);
		
		double dnum = 10.2;
		
		//�Ǽ��� ������ ������ �� ���� ����ȯ
		int inum = (int)dnum;
		
		System.out.println("inum: " + inum);
	
		System.out.println("inum�� �Ǽ���:: " + (double)inum);
	
	}
	
	
	
	
	
	
}

package com.test01;

public class Variable01 {
	
	//main �޼ҵ�, ���α׷� ������
	//�޼ҵ� = ���
	public static void main(String[] args) {
		
		// Ÿ�� ������ = ��;
		//Ÿ�� : ������ ������ ��� ������ ���� ���� ����
		//������: ������ �̸�
		//��: ���ͷ�, ������ �� ������
		
		//�޼ҵ� ���
		
		//�غ�!!
		//--Ŭ������ ������ = new Ŭ����()
		Variable01 test = new Variable01();
		
		//�޼ҵ� ����
		//������.�޼ҵ��();
		test.declareVariable();
		
		//--------------------
		//�غ�
		Variable01 test2 = new Variable01();
		//����
		test2.initVariable();
		
		
		
	}
	
	//�޼ҵ� = ���, �ǽ� �޼ҵ�(���� ����, �� ����, �� Ȯ��)
	public void declareVariable() {
		//������
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//�Ǽ�
		float fnum;
		double dnum;
		
		//����
		boolean isTrue;
		
		//������
		char ch;
		
		//���ڿ�(������)
		String str;
		
		//-------------------
		
		//���� & ���
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0f;
		dnum = 8.0;
		
		isTrue = true;
		
		ch = 'A';
		str = "A";
		
		//������ ����� �� �ܼ�â�� ����ϱ�
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println();
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println();
		System.out.println(isTrue);
		System.out.println();
		System.out.println(ch);
		System.out.println(str);
	}
	
	public void initVariable() {
		//���� ����� ���ÿ� �ʱ�ȭ
		byte bnum = 1;
		int inum = 4;
		float fnum = 4.0f;
		double dnum = 8.0;
		
		char ch = 'A';
		String str = "�ȳ��ϼ���";
		
		//������ ����ϱ�
		System.out.println(bnum);
		System.out.println(inum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(ch);
		System.out.println(str);
	}
	

		

}

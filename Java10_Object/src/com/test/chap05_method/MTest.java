package com.test.chap05_method;

public class MTest {

	public static void main(String[] args) {
		MethodTest test = new MethodTest();
		
		
		
		//1. �Ű����� ���� ��ȯ�� ���� �޼ҵ�
		//1.
		test.method1();
		
		
		
		
		
		//2. �Ű����� ���� ��ȯ���� �ִ� �޼ҵ�
		//2.
		//String result = test.method2();
		//System.out.println(result);
		System.out.println( test.method2());
		
		
		//3. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ�
		//3.
		test.method3(10, 20);
		
		
		
		//4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
		//4.
		int res = test.method4(10, 20);
		System.out.println("res: "+ res);
		//System.out.println("res: " + test.method4(10, 20));
	
	
		////////////////////////////
		//1.�Ű������� ���� ���ϰ��� ������ static �޼ҵ�
		MethodTest2.sMethod1();
		
		
		//2.�Ű������� ���� ���ϰ��� ������ static �޼ҵ�
		System.out.println("10�� 20�� ����" + MethodTest2.sMethod2()+ " �Դϴ�");
		
		
		//3.�Ű������� �ְ� ���ϰ��� ������ static �޼ҵ�
		MethodTest2.sMethod3("sooho");
		
		
		//4.�Ű������� ���ϰ��� ������ static �޼ҵ�
		System.out.println(MethodTest2.sMethod4("sooho"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

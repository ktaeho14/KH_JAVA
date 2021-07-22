package com.chap01_runtime;

import java.util.Scanner;

public class RunException {
	Scanner sc = new Scanner(System.in);
	
	
	
	
	//ArithmeticException ���� (if���� ����Ͽ� ó��) --0���� ��������� ����� ����
	public void ArithEx() {
		int ran =0;
		double result = 0.0;
		
		System.out.println("���� �ϳ� �Է�: "); //����: ������ ��, ������: �������� ��
		int inputNum = sc.nextInt();
		
		if(inputNum == 0) {
			System.out.println("0�� �Է��Ͽ����ϴ�. ����� �Ұ��� �մϴ�.");
		}else {
			ran = (int)(Math.random()*10)+1;
			result = ran/ (double)inputNum;
			System.out.println(ran+ " / " + inputNum + " = " +result);
		
		}		
	
	
	
	//try - catch�� ó��
		
//		try {
//			ran = (int)(Math.random()*10)+1;
//			result = ran/ (double)inputNum;
//	
//			
//			System.out.printf("%d / %d = %.2f\n", ran,inputNum,result);
//		
//			
//		}catch(ArithmeticException e) {
//			System.out.println("���� �߻�!!!");
//		}
	
	
	
	
	}
	
/*	public void ClassNArrayEx() {
		//ClassCastException ����ȯ�� ����� ����
		
		
		
		
		
		
		Object obj = 'a'; //char�� �����̵ǰ� �������� �̿��Ͽ� Object class�� obj�ȿ� ����
		System.out.println(obj);
		String str = (String)obj; //String���� ��������ȯ
		//java.lang.Character cannot be cast to java.lang.String ��� ������ ���԰�
		//Character�� String ���� ����ȯ�� �� �� ���ٶ�� �ǹ��̴�.
		//at com.chap01_runtime.RunException.ClassNArrayEx(RunException.java:53)
		//at com.chap01_runtime.MTest.main(MTest.java:9)
		//ClassNArrayEx�޼ҵ��� 53��°���� ���������⶧���� MTest������ ������ �̾�����. 
		
		System.out.println(obj);
		
		
	}
	*/
	
	public void ClassNArrayEx() {
		try {
			//ClassCast	Exception 	catch~try�� ���
//			Object obj = 'a';
//			System.out.println(obj);
//			String str = (String)obj;
//			System.out.println(str);
			
			//Arithmetic Exception 	catch~try�� ���
//			int no1 = 10;
//			int no2 = 0;
//			System.out.println(no1/no2);
		
			//Nullpointer 	Exception
//			String str = null;
//			int length = str.length();
		
//			ArrayIndexOutOfBounds Exception
			int[] arr = new int[2];
			arr[0] = 1;
			arr[1] = 2;
			
			arr[2] = 3;
			System.out.println("���????");
			
			
//		}catch(ClassCastException e) {
//		//System.out.println("���ܹ߻�");
//			e.printStackTrace();
//		}catch(ArithmeticException e1) {
//			System.out.println("���ܹ߻�1");
//			e1.printStackTrace();
//		}catch(NullPointerException e2) {
//			System.out.println("���ܹ߻�2");
//			e2.printStackTrace();
//		}catch(ArrayIndexOutOfBoundsException e3) {
//			System.out.println("���ܹ߻�3");
//			e3.printStackTrace();
//		}
		
		}catch(ClassCastException | ArrayIndexOutOfBoundsException 
				| NullPointerException | ArithmeticException e) {
			System.out.println("���ܹ߻���.");
			e.printStackTrace();
		}finally {
			System.out.println("������ �������� ����!!");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

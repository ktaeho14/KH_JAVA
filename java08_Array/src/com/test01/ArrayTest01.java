package com.test01;

public class ArrayTest01 {
		public void testArray() {
//		int num1 = 10;
//		int num2 = 20;
//		int num3 = 30;
//		int num4 = 40;
//		int num5 = 50;
//		
//		int sum = 0;
//		
//		sum += num1;
//		sum += num2;
//		sum += num3;
//		sum += num4;
//		sum += num5;
		
			
		//�迭
		int[] arr = new int[5];	
//			arr[0] = 10;
//			arr[1] = 20;
//			arr[2] = 30;
//			arr[3] = 40;
//			arr[4] = 50;
			
		for(int i=0; i<arr.length; i++) {
			 arr[i] = (i+1)*10;
		}
		
			int sum = 0;
			
//			sum += arr[0];
//			sum += arr[1];
//			sum += arr[2];
//			sum += arr[3];			
//			sum += arr[4];
			for(int i = 0; i<arr.length; i++) {
				sum += arr[i];
			}
			
			
			System.out.println(sum);
			
			
			
			
			
		
		}
		
		public void testArray2() {
			//�迭�� ����, �Ҵ� 
			//����
			//�ڷ���[] ������; �ڷ��� ������[];
			
//			int[] iarr;
//			char carr[];
//			
//			//�Ҵ�
//			//iarr = new int[]; ũ�⸦ ������ ���� �ʾƼ� ����
//			iarr = new int[5];
//			carr= new char[10];
			
			
			//����� �Ҵ�
			int[] iarr = new int[5];
			char carr[] = new char[10];
			
			System.out.println("iarr: " + iarr);
			System.out.println("carr: " + carr);
			
			System.out.println("iarr�� hashchde : " + iarr.hashCode());
			System.out.println("carr�� hashcode : " + carr.hashCode());
		
			System.out.println("iarr�� ����: " + iarr.length);
			System.out.println("carr�� ����: " + carr.length);
		
			
			//
			int size = 3;
			double[] darr = new double[size];
			
			System.out.println("darr�� hashcode: " + darr.hashCode());
			System.out.println("darr�� ����: " + darr.length);
			
			darr = new double[30];
			System.out.println("darr�� hashcode: " + darr.hashCode());
			System.out.println("darr�� ����: " + darr.length);
			
			darr = null;
			System.out.println("���� �� darr�� ����: " + darr.length);
			
			
		}
		
		public void testArray3() {
			
			int[] iarr = new int[5];
			
			for(int i=0; i<iarr.length; i++) {
				System.out.println("iarr["+i+"]�� ��: " + iarr[1]);
			}
			
			
			//int[] iarr2 = {11,22,33,44,55};
			int[] iarr2 = new int[] {11,22,33,44,55,66};
			
			System.out.println("iarr2�� ����" + iarr2.length);
			
			String sarr[] = {"apple" , "banana", "orange"};
			
			for(int i = 0; i<sarr.length; i++) {
				System.out.println(sarr[i]);
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	


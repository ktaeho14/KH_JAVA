package com.test01;

import java.util.Random;

public class DeArrayTest2 {

		public void test01() {
			//�������� 2���� �迭�� �־��
			int[][] arr = new int[8][9];
			
			for(int i = 0;i< arr.length; i++ ) {
				System.out.println("======="+(i+2)+"=========");
				for(int j=0; j<arr[i].length; j++ ) {
					arr[i][j] = (i+2)*(j+1);
					System.out.println( (i+2) + " * " + (j+1) + " = " + arr[i][j] );
				
				
				
				
				}
			}
			
			
			
			
		}
//		- �޼ҵ�� : public void munjae1()
//		 - �������� : 
//		   1. 4��4�� 2�����迭 ���� �� ����
//		   2. 0��0������ 2��2������ 1���� 100������ ������ ������ ����� ����
//		   3. �Ʒ��� ����ó�� ó����
//		      0��   1��   2��   3��   
//		   0��   ��  	 �� 	  ��    0�� ������ �հ�
//		   1��   �� 	 �� 	  ��   1�� ������ �հ�
//		   2��   ��  	 ��  	 ��   2�� ������ �հ�
//		   3��   0���հ�   1���հ�   2���հ�   ����+�����հ�
//		
	
		public void munjae() {
			int[][] iarr = new int[4][4];
			
			
			//�����
			for(int i =0; i<iarr.length-1; i++) {
				for(int j=0; j<iarr[i].length-1; j++) {
					iarr[i][j] = (int)(Math.random()*100) +1;
				}
			}
		
			
			
			//������
			for(int i =0; i<iarr.length-1;i++) {
				for(int j =0; j<iarr.length-1; j++) {
					
					iarr[i][3] += iarr[i][j];
					iarr[3][i] += iarr[j][i];
					
					
				}
				iarr[3][3] += iarr[i][3]+iarr[3][i];
			}
			
			
			
			
			
			
			
			//���
			for(int i=0;i<iarr.length;i++) {
				for(int j=0; j<iarr.length; j++) {
					System.out.print(iarr[i][j] + "\t");
				}
				System.out.println();
				
				
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
		
		
		
		
		
		/*	
		public void munjae1() {
		int[][] arr = new int[4][4];
		
		for(int i =0;i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] =(int)(Math.random()*100)-1;
				System.out.print("\t" + arr[i][j]);
				
				
			}System.out.println();
		
			}
		
		}
}
		*/
		
		
		
		
		
		
		/*
		munjaeprn(arr);
		
		}
		
		public  void munjaeprn(int[][] arr) {
			for(int i=0; i<arr.length; i++) {
				for(int j =0;j<arr[i].length; j++) {
					System.out.print("\t"+arr[i][j]);
				
				
				
				
				}System.out.println("\n");
			}
		}
		
}
*/
package com.test01;

public class DeArrayTest {
	
	
	public void testInit() {
		//2���� �迭
		//����
		int[][] iarr1;
		int iarr2[][];
		
		//�Ҵ�
		//heap������ 2���� �迭�� �Ҵ�(�����迭)
		iarr1 = new int[3][5];
		
		
		//
		iarr2 = new int[3][];
		
		iarr2[0] = new int[5];
		iarr2[1] = new int[5];
		iarr2[2] = new int[5];
		
		
		//�迭�� �� ���
		for(int i=0; i<iarr2.length; i++) {
			for(int j=0; j<iarr2[i].length; j++) {
				System.out.print(iarr2[i][j] + " ");
			}
			System.out.println();
		}
	
		//���� �� �Ҵ�
		int[][] iarr = new int[3][5];
		//�ε����� �����Ͽ�
//		iarr[0][0] = 1;
//		iarr[0][1] = 2;
		
		//���� for���� �̿��Ͽ� �� ���
		
		int val= 1;
		
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j] = val++;
			}
		}
		
		
		
		prnArray(iarr);
		
		
	
	
	}
	
	//������ �迭�� ���޹޾� ����ϴ� �޼ҵ�
		public void prnArray(int[][] iarr) {
			for(int i = 0; i<iarr.length; i++) {
				for(int j =0; j<iarr[i].length; j++) {
					System.out.print("\t"+ iarr[i][j]);
				}
				System.out.println();
			}
			
			
			
			
			
		}
	
		public void testInit2() {
			//�����迭
			int[][] iarr = new int[3][];
			
			
			iarr[0] = new int[5];
			iarr[1] = new int[10];
			iarr[2] = new int[3];
			
			//prnArray(iarr);
			
			//�� ����
			int val = 0;
			for(int i = 0; i<iarr.length; i++) {
				for(int j = 0; j<iarr[i].length; j++) {
					iarr[i][j] = ++val;
				}
			}
			
			prnArray(iarr);
			
		}
		
		public void testInit3() {
			//�Ҵ�� �ʱ�ȭ�� ���ÿ�
			//int[][] iarr = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
			int[][] iarr = { {1,2,3}, {4,5,6,7,8} ,{9}};
			
			
			prnArray(iarr);
			
		}
	
	
	
}

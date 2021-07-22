package com.test01;

public class ArrayTest03 {

	public static void main(String[] args) {
		ArrayTest03 at = new ArrayTest03();
		//at.shallowCopy();
		//at.deepCopy();
		//at.deepCopy2();
		at.deepCopy3();
	}

	public void shallowCopy() {
		//��������
		int[] oArr = {1,2,3,4,5};
		int[] cArr = oArr;
		
		//����
		String str = " ";
		for(int i=0; i<oArr.length; i++) {
			str +=oArr[i] + " ";
		}
		System.out.println("1.oArr : " + str);
		
		//���纻
		str = "";
		for(int i =0;i<cArr.length;i++) {
			str += cArr[i] + " ";
			
		}
		System.out.println("2.cArr : " + str);
		
		
		//���� �迭 �ε��� 0�� ���� 99�� ����
		oArr[0] = 99;
		
		str = "";
		for(int i=0; i<oArr.length;i++) {
			str += oArr[i] + " ";
		}
		
		System.out.println("1.oArr : " + str);
		
		
		str ="";
		for(int i =0;i<cArr.length;i++) {
			str +=cArr[i] + " ";
		}
		System.out.println("2.cArr : " + str);
		
		//
		System.out.println("oArr�� hashcode" + oArr.hashCode());
		System.out.println("cArr�� hashcode" + cArr.hashCode());
		
		
		
		
	}
	
	public void deepCopy() {
		//��������
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[5];
		
		//for���� �̿��Ͽ� 1:1�� ���� ����
		for(int i=0;i<oArr.length;i++) {
			cArr[i]=oArr[i];
		}
		
		
		//�������
		String str = " ";
		for(int i = 0; i<oArr.length;i++) {
			str+=oArr[i]+ " ";
		}
		
		System.out.println("1.oArr : " + str);
		//���纻 ���
		str = " ";
		for(int i=0;i<cArr.length;i++) {
			str += cArr[i] + " ";
		}
		System.out.println("2.cArr : " + str);
		
		
		
		
		
		//���� �迭 �ε��� 0�� ���� 99�� ����
		oArr[0] = 99;
		
		str =" ";
		for(int i=0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}System.out.println("oArr : " + str);
		
		str=" ";
		for(int i=0; i<cArr.length; i++) {
			str +=cArr[i] + " ";
		}System.out.println("cArr : " + str);
		
		
		System.out.println("oArr�� hashcode : " + oArr.hashCode());
		System.out.println("cArr�� hashcode : " + cArr.hashCode());
		
		
		
		
		
	}
	
	
	public void deepCopy2() {
		//2.arraycopy()
		//java.lang.System�� �ִ� arraycopy()
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[10];
		
		
		System.arraycopy(oArr, 0, cArr, 5, oArr.length-1);
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//src: �����迭, srcPos:���� ������ġ
		//dest: ī�ǹ迭, dstPos:�ٿ��ֱ� ������ġ
		//length: ����� ����
		
		String str = " ";
		for(int i =0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println("oArr : " + str);
		
		str = " ";
		for(int i =0; i<cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("cArr : " + str);
		
		System.out.println(oArr.hashCode());
		System.out.println(cArr.hashCode());
	}
	
	public void deepCopy3() {
		//clone()
		
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[10];		
		
		System.out.println("cArr�� hashcode : " + cArr.hashCode());
		
		cArr = oArr.clone();
		
		System.out.println("����� cArr�� hashcode : " + cArr.hashCode());
		System.out.println(cArr.length);
		
		String str = " ";
		for(int i =0; i<cArr.length; i++) {
			str += cArr[i] + " ";
	}
	System.out.println("cArr �� �� : " + str);
	
	
	
	
	
	}
	
}

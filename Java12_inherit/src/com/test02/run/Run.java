package com.test02.run;

import com.test02.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book b1 = new Book("�ð��� ���ߴ� ��","��Ʈ���̱�",100);
		Book b2 = new Book("�ν�Ʈ�ɹ�","�����",200);

		//toString();
//		System.out.println("b1 =" + b1.toString());
//		System.out.println("b2 =" + b2.toString());
		
		System.out.println("b1= " +b1);
		System.out.println("b2= " +b2);
	
		//Book ��ü ��
		System.out.println("b1�� b2�� ���� ��ü?: " + b1.equals(b2));
		
		//��������
		Book b3 = b1;
		System.out.println("b1�� b3�� ������ü? : " + b1.equals(b3));
		
		//b1�� ���� ������ b4 ��ü ����� ��
		Book b4 = new Book("�ð��� ���ߴ� ��","��Ʈ���̱�",100);
		
		//equals() �������̵��� ���� ��� Ȯ��
		System.out.println("b1�� b4�� ���� ��ü? : " + b1.equals(b4));
		//�ּҰ��� �ٸ����� ���� ���� ��ü�� ���ü
		//�ּҰ� ���� ���� ��ü ���ϰ�ü
		
	//	System.out.println(b1.hashCode());
	//	System.out.println(b4.hashCode());
		
		
		//hashcode() �������̵��� ���� ���ϼ� Ȯ��
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());
		
		
		
	
	
	
	
	
	}
	
	
	

}

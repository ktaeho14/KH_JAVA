package com.poly.part01.test05;

public class TvMain {

	public static void main(String[] args) {
		//lg tv(+1)�� samsung tv(+3)�� �����
		//���� ��/�ٿ��� �ϼ� �ϰ�
		//������ ȣ�� �ɽ� "tv�� �������ϴ�"��� ���
		
		//tvClosed() �޼ҵ带 ����� ȣ���ϸ�
		//"tv�� �������ϴ�." ���
		
		
		
		Samsung_tv sg = new Samsung_tv();
		
		System.out.println(sg.volUp());
		System.out.println(sg.volUp());
		System.out.println(sg.volUp());
		
		System.out.println(sg.volDown());
		System.out.println(sg.volDown());
		System.out.println(sg.volDown());
		
		sg.tvClosed();
		
		
		
	}

}

package com.silsub2.point.model.vo;

public class Circle extends Point {
	//�ʵ�
	private int radius;

	//�⺻������
	public Circle() {}
	//�Ű����������� (�θ�Ŭ������ �Ű������� �ҷ��;��Ѵ�)
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	
	
	
	//���� x,y��ǥ ������ �ѷ� ��� ��� java.lang.Math.PI ���
	@Override
	public void draw() {
		super.draw();
		System.out.println("���� ����: " +(Math.PI * radius * radius));
		System.out.println("���� �ѷ�: " + (Math.PI * radius *2));
	
	}
	
	
	
	
}

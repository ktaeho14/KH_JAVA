package com.silsub2.point.model.vo;

public class Rectangle extends Point {
	
	//�ʵ�
	private int width;
	private int height;
	
	//�⺻ ������
	public Rectangle(){}

	//�Ű����� ������
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	
	//getter & setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("�簢���� ����: " + (width * height));
		System.out.println("�簢���� �ѷ�: " + ( ( width + height )*2) );
		
		
	}
	
}

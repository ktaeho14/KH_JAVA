package com.silsub2.point.model.vo;

public class Point {
	//�ʵ�
	protected int x;
	protected int y;
	
	//�⺻������
	public Point(){}
	//�Ű����� ������
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//getter & setter �޼ҵ�
	
	public void draw() {
		System.out.println("x: " + x + ",y: " + y);
	}
	
	
	
}

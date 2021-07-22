package com.silsub;

public class Car {
	private String color;
	private int speed;
	
	
	//������(�⺻, �Ű�����)
	
	public Car() {}
	public Car(String color) {
		this.color = color;
		
	}
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	
	
	
	//getter & setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	//toString
	@Override
	public String toString() {
		return " ���� �ӵ��� " + speed + "�Դϴ�";
	}
	
	public void accelPedal() {
		System.out.println("�ӵ��� �ö󰩴ϴ�.");
		setSpeed(getSpeed()+10);
	}
	
	public void breakPedal() {
		System.out.println("�ӵ��� �������ϴ�");
		setSpeed(getSpeed()-10);
		
		
		if(getSpeed()>0) {
			System.out.println("�ӵ��� �پ��ϴ�");
		}else {
			setSpeed(0);
			System.out.println("������ϴ�");
		}
	}
	
	
	
}

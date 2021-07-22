package com.silsub;

public class SportsCar extends Car {
	public SportsCar() {
		System.out.println("������ī ����");		
	}
	
	public SportsCar(String color) {
		super(color);
		System.out.println(color + "�� �������� ����");
	}
	
	@Override
	public void accelPedal() {
		System.out.println("�ӵ��� �� ���� �ö� ���ϴ�");
		super.setSpeed(super.getSpeed()+30);
	}
	
	@Override
	public void breakPedal() {
		super.setSpeed( super.getSpeed()-30);
		
		if(super.getSpeed() > 0) {
			System.out.println("�ӵ��� �� ���� �پ��ϴ�.");
		}else {
			super.setSpeed(0);
			System.out.println("������ϴ�.");
		}
	}
	
	@Override
	public String toString() {
		return "������ī�� ���� �ӵ���" + getSpeed() + "�Դϴ�";
	}
}
package com.poly.part01.test01;

public abstract class Animal {
	//abstaract �߻�Ŭ����
	
	public void eat(String animal) {
		System.out.println(animal+ "�Դ´�");
	}
	
	//�߻�޼ҵ� -> ��ӹ޴� Ŭ������ �ݵ�� ����
	public abstract void bark();
	
}

package com.test.chap01.encapsulation;

public class Account {
	//�ʵ�
	private String name = "���ȣ";
	private String accNo = "01091967013";
	private String pwd = "1234";
	private int bankCode = 20;
	private int balance = 0;
	
	//������ 
	public Account() {}
	
	
	//�Ա��� ���� �޼ҵ�
	public void in(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿�" + money + "���� �ԱݵǾ����ϴ�.");
		}else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�");
		}
	}
	
	//���
	public void out(int money) {
		if(money < balance) {
			balance -= money;
			System.out.println(name+"���� ���¿�" + money + "���� ��ݵǾ����ϴ�");
		}else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
		}
	}
	
	//�ܾ� ��ȸ
	public void displayBalance() {
		System.out.println(name + "���� ���¿� �ܾ���" + balance + "�� �Դϴ�.");
	}
	
}

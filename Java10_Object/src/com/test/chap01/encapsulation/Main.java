package com.test.chap01.encapsulation;

public class Main {

	public static void main(String[] args) {
		Account ac = new Account();
		
		//�ܾ���ȸ
		ac.displayBalance();
		
		//100���� �Ա�
		ac.in(1000000);
		ac.displayBalance();
		
		//150���� �Ա�
		ac.in(1500000);
		ac.displayBalance();

		//50���� ���
		ac.out(500000);
		ac.displayBalance();
		
		
		
		
		//ac.balance -= 2000000;
		//ac.displayBalance();
		
		ac.out(1000000);
		ac.displayBalance();
	}

}

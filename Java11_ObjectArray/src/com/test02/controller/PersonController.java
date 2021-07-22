package com.test02.controller;

import java.util.Scanner;

import com.test02.model.dto.Person;

public class PersonController {
	private Person[] people = new Person[2];
	Scanner sc = new Scanner(System.in);
	
	public PersonController() {}
	
	
	
	
	/////////
	
	
	//ȸ�� �߰�
	public void insertPerson() {
		for(int i=0;i<people.length;i++) {
			System.out.println("==ȸ�� ���� �Է�==");
			
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("����: ");
			int age =sc.nextInt();
			System.out.print("���: ");
			int wealth = sc.nextInt();
		
			people[i] = new Person(name, age, wealth);
			
		}
		
		
	}
	
	//ȸ�� ��ü ��ȸ
	public void printPerson() {
		
		for(int i=0;i<people.length; i++) {
			System.out.println(people[i].info());
		
		
		
		}
		
	}
	
	//��� ��� ��ȸ
	public void avgWealth() {
		//people�� ����Ǿ� �ִ� people��ü���� wealth ��հ� ���Ͽ� ���
		
		int sum = 0;
		
		for(int i=0; i<people.length; i++) {
			sum += people[i].getWealth();
			
			//people[0].getWealth() + people[1].getWealth() /
			
		}System.out.println("��� ���: " + (sum/people.length));
		
	}
	
	//ȸ�� �̸����� �˻�
	
	public void searchPerson() {
		//�̸��� �Է¹޾� people�迭�� ����Ǿ� ȸ���� ã�� ���
		System.out.println("ã�� �̸��� �Է��ϼ���: ");
		String searchname = sc.next();
			for(int i =0; i<people.length; i++) {
				if(people[i].getName().equals(searchname)){
					System.out.println(people[i].info());
					
				}else {
					System.out.println("�˻��� ȸ���� �����ϴ�");
				}
			}
	}
	
	
	
}

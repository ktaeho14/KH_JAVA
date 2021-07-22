package com.collection.silsub2.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.collection.silsub2.controller.BookManager;
import com.collection.silsub2.model.vo.Book;
//ȭ�鿡 ���̴ºκ�
public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	
	
	//�⺻������
	public BookMenu() {}
	
	
	//�������� ���α׷��� �ش��ϴ� ���� �޴� ���
	//�� �޴��� �ش��ϴ� BookManager Ŭ������ �޼ҵ� ����->�ݺ����
	public void mainMenu() {
		
		while(true) {
			System.out.println("***���� ���� ���α׷� ***");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. �������� ���� �� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻����");
			System.out.println("5. ��ü ���");
			System.out.println("6. ������");
		
			System.out.println("�޴�����: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				//inputBook()�� �Ű������� �Ѱ�����
				//BookManager�� addBook�� �Ű������� BookŸ�����϶��Ǿ��ִ�.
				Book b = inputBook();
				bm.addBook(b);
				break;
			case 2:
				bm.printBookList(bm.sortedBookList());
				break;
				
			case 3:
				int result = bm.deleteBook(inputBookNo());
				
				if(result == 1) {
					System.out.println("���������� �����Ǿ����ϴ�");
				}else {
					System.out.println("������ Book�� �������� �ʽ��ϴ�");
				}
				break;
			case 4:
				int index = bm.searchBook(inputBookTitle());
				
				if(index == -1) {
					System.out.println("��ȸ�� Book�� �������� �ʽ��ϴ�");
				}else {
					System.out.println(bm.selectBook(index));
				}
				
				break;
				
				
				
			case 5:
				ArrayList<Book> list = bm.selectALL();
				if(list.isEmpty()) {
					System.out.println("������ �����ϴ�.");
				}else {
					Iterator it = list.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
						
					}
				}
				
				break;
				
			case 6:
				System.out.println("���α׷��� �����մϴ�");
				return;
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	


	//Book ��ü�� �ʵ� ���� Ű����� �Է� �޾� �ʱ�ȭ �ϰ� ��ü ����
	public Book inputBook() {
		System.out.println("����: ");
		String title = sc.nextLine();
		System.out.println("�帣(1.�ι�/ 2.�ڿ�����/ 3.�Ƿ�/ 4.��Ÿ) ���ڷ� �Է�: ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.println("����: ");
		String author= sc.nextLine();
		//�ϰ�ü�� ���Ϲޱ� BookŬ���� ���� Ȯ��
		return new Book(category, title, author);
	}
	
	
	public int inputBookNo() {
		System.out.println("������ȣ: ");
		int no = sc.nextInt();
		return no;
		
	}
	
	public String inputBookTitle() {
		System.out.println("��������: ");
		String title = sc.nextLine();
		return title;
	}
	
}



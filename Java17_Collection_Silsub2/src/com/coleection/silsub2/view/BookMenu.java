package com.coleection.silsub2.view;

import java.util.Scanner;

import com.coleection.silsub2.controller.BookManager;
import com.coleection.silsub2.vo.Book;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {}
	
	public void mainMenu() {
		
		
		while(true) {
			System.out.println("****도서관리 프로그램****");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 도서 전체출력");
			System.out.println("6.끝내기");
			
			
			System.out.println("메뉴 선택");
			int num = sc.nextInt();
			
			
			
			switch(num) {
			case 1:
				bm.addBook(null);
				break;
			case 2:
				
				
				break;
			case 3:
				bm.deleteBook(null);
				break;
			case 4:
				break;
			case 5:
				break;
			case 6: 
				return;
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Book inputBook() {
		System.out.println("제목: ");
		String title = sc.nextLine();
		System.out.println("저자: ");
		String author = sc.nextLine();
		System.out.println("장르(1.인문/ 2.자연과학/ 3.의료/ 4.기타)숫자로 입력: ");
		int category = sc.nextInt();
		
		
		return new Book(category, title, author);
	}
	
	public String inputBookNo() {
		return null;
	}
	
	public String inputBookTitle() {
		return null;
	}
	
	
	
	
	
	
}

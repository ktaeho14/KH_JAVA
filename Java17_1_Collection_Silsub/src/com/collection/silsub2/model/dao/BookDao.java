package com.collection.silsub2.model.dao;

import java.util.ArrayList;

import com.collection.silsub2.comparator.AscCategory;

//dater accepts object


import com.collection.silsub2.model.vo.Book;

public class BookDao {
	private ArrayList<Book> bookList;
	
	public BookDao() {
		bookList = new ArrayList<Book>();
	}

	public BookDao(ArrayList<Book> list) {
		
		bookList = list;
	}
	
	//������ ������ ��ȣ�� ����
	public int getLastBookNo() {
		
		return bookList.get(bookList.size()-1).getbNo();
	}
	
	
	//�� ���� �߰�
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	// ���� ����
	public int deleteBook(int no) {
		int result = 0;
		for(int i=0; i<bookList.size();i++) {
			if(bookList.get(i).getbNo()==no) {
				bookList.remove(i);
				result = 1;
			}
		}
		
		return result;
	}
	
	// ���� �˻�
	public int searchBook(String tilte) {
		int index = -1;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(tilte)) {
				index= i;
			}
		}
		
		
		
		return index;
	}
	
	//���� �˻�
	public Book selectBook(int index) {
		
		return bookList.get(index);
	}
	
	//��ü ���(���������� �����͵鿡�� �����ҿ���) (ArrayList�� �ٴ�Ƽ� ������ ���ش�)
	public ArrayList<Book> selectAll(){
		
		return bookList;
	}
	
	
	//���� (ArrayList�� �ٴ�Ƽ� ���������ش�)
	public ArrayList<Book> sortedBooklist(){
		bookList.sort(new AscCategory());
		
		return bookList;
	}
	
}

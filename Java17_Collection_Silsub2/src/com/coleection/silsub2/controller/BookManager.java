package com.coleection.silsub2.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.coleection.silsub2.model.dao.BookDao;
import com.coleection.silsub2.vo.Book;

public class BookManager {
	private BookDao bd = new BookDao();
	private Scanner sc = new Scanner(System.in);
	
	public BookManager() {}
	
	public void addBook(Book book) {
		System.out.println("�߰��� ������ �̸��Է�: ");
		bd.addBook(book);
	}
	
	public Book deleteBook(String key) {
		
		
		System.out.println("������ ������ �̸��Է�: ");
		
		return bd.deleteBook(null);
	}
	
	public String searchBook(String title) {
		return null;
	}
	
	public Book selectBook(String key) {
		return null;
	}
	
	public HashMap<String, Book> selectAll(){
		return null;
	}
	
	public Book[] sortedBookList() {
		return null;
	}
	
	public void printBookList(Book[] br) {
		
	}
	
	
	
	
}

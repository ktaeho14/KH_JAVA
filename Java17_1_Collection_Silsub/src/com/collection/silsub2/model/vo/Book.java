package com.collection.silsub2.model.vo;
//vo = value object 
//�ʿ䵥���͸� �����ϴ°� model
//dto �������� �����͸� ����а�
//���� : 1. �ʵ�private , 2.�⺻������,�Ű����� �����ڰ��־���Ѵ� , 3.getter,setter�޼ҵ�����
public class Book {
	private int bNo;
	private int category;
	private String title;
	private String author;
	
	
	public Book() {}


	public Book(int category, String title, String author) {
		
		this.category = category;
		this.title = title;
		this.author = author;
	}


	public int getbNo() {
		return bNo;
	}


	public void setbNo(int bNo) {
		this.bNo = bNo;
	}


	public int getCategory() {
		return category;
	}


	public void setCategory(int category) {
		this.category = category;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		String str = "";
		
		if(category ==1) {
			str ="�ι�";
			
		}else if(category == 2) {
			str = "�ڿ���Ȯ";
		}else if(category ==3) {
			str ="�Ƿ�";
		}else if(category == 4) {
			str ="��Ÿ";
		}
		
		
		return "������ȣ: "+bNo+" �з�:"+str+"����: " +title+ " ����: "+author;
	}
	
	
	
	
}

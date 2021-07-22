package com.silsub1.book.model.vo;

public class Book {
	
	public static Book clone;
	//�ʵ�
	private String title;	//å����
	private String author;	//���ڸ�
	private int price;		//����

	//�⺻������
	public Book() {}
	//�Ű����� ������

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	
	
	//getter & setter �޼ҵ�
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title + "," + author + ", " + price;
	}

	
	//ex   b1.equals(b3);
	@Override
	public boolean equals(Object obj) {     
		if(this == obj) {       //this(b1)      obj(b3)
			return true;
		}
		if(obj == null) {
			return false;
	}
/////////////////////////////////
			Book other = (Book)obj;     //Book ���� ����ȯ�� ������
			if(title == null) {			
				if(other.title!=null) {
					return false;
				}
			}else if(!title.equals(other.title) ) {   //b1�� b3�� ���ڿ��� ��     �ֳ��ϸ� if(title ==null)�̾ƴϱ⶧���� else if�� �����̵�
				return false;
			}
/////////////////////////////////
			if(author==null) {
				if(other.author !=null) {
					return false;
				}
			}else if(!author.equals(other.author)) {
				return false;
			}
	////////////////////////////////		
			if(price !=other.price) {
				return false;
			}











		return true;
	}
	
	@Override
	public int hashCode() {
		return (author+title+price).hashCode();
	}
}


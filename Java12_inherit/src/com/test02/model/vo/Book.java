package com.test02.model.vo;

public class Book  {
	
	//�ʵ�
	private String title;
	private String writer;
	private int price;
	
	//�⺻������
	public Book() {}
	
	//�Ű����� ������
	public Book(String title, String writer, int price) {
		
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	
	//getter , setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//toString
	
//	@Override
	public String toString() {
		return title + ", " + writer + " + , " + price;
		
		
	}
	
	
	//equals()
	// ex - b1.equals(b4)
	@Override
	public boolean equals(Object obj) {
		//��ü�� �ּҰ� ������ ���� ��ü�̴�.
		if(this == obj) {
			return true;
		}
		//���޹��� ��ü�� null�� ���� ������ �ٸ� ��ü
		if(obj == null) {
			return false;
		}
		
		
		//////////////////////
		//���޹��� ��ü�� ����ȯ �Ͽ� �ʵ庰�� ��
		Book other = (Book)obj;
		
		//b1�� ������ null�̸� b4�� ���� null, �׷��� ������ false��������!
		if(title ==null) {
			if(other.title!=null) {
				return false;
			}
			//�� ��ü�� �̸��� ���� �ٸ� ��쿡�� false����
		}else if( !title.equals(other.title) ) {
			return false;
		}
		
		//�۰�
		if(writer ==null) {
			if(other.writer !=null) {
				return false;
				
			}
		}else if(!writer.equals(other.writer)) {
			return false;
		}
		
		//�⺻ �ڷ���
		//price
		if(price != other.price) {
			return false;
		}
		
		
		
		return true;
	}
	
	
	//hashCode()
	@Override
	public int hashCode() {
		
		return (writer+price+title).hashCode();
	}
	
	
	
	
	
	
	
	
	
}

package com.test01.before;

import java.util.Date;

public class TeleVision {
	private String brand;			//������
	private String productNumber;	//��ǰ��ȣ
	private String productCode;		//��ǰ�ڵ�
	private String productName;		//��ǰ��
	private int price;				//����
	private Date date;				//��������
	private int inchType;			//��ġ
	
	//������(�⺻,�Ű�����)
	public TeleVision() {}
	
	public TeleVision(String brand, String productNumber, String productCode,
					  String productName, int price, Date date, int inchType) {
		
		this.brand =brand;
		this.productNumber=productNumber;
		this.productCode=productCode;
		this.productName=productName;
		this.price=price;
		this.date=date;
		this.inchType=inchType;
		
		
		
	}
	//getter & setter
	
	//brand getter & setter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	//productNumber getter & setter
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber=productNumber;
	}
	
	
	//productCode getter & setter
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode=productCode;
	}
	
	
	//productname getter & setter
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	
	//price getter & setter
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	
	//date getter & setter
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date=date;
	}
	
	
	//inchType getter & setter
	public int getInchType() {
		return inchType;
	}
	
	public void setInchType(int inchType) {
		this.inchType=inchType;
	}
	
	
	public void prn() {
		System.out.println(brand+", " +productNumber +", "+ productCode +", "
				+ productName+", " +price +", " + date + "," + inchType);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

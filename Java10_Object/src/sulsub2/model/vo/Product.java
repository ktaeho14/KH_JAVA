package sulsub2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	//�⺻ ������
	public void Product() {
		
	}
	
	//setter
	public void setPName(String pName) {
		this.pName=pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//getter
	
	public String getPName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	public String information() {
		
		Product pr = new Product();
		pr.setPName("����");
		pr.setPrice(15000);
		pr.setBrand("mlb");
		System.out.println(pr.getPName());
		System.out.println(pr.getPrice());
		System.out.println(pr.getBrand());
		return "";
	}
	
	
	
}

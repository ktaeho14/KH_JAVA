package silsub3.model.vo;

public class Circle {

	//�ʵ�
	public static double PI=3.14;
	private static int radius;
	
	//������
	public Circle(){}
	
	
	//setter
	public void setPI(double PI) {
		this.PI =  PI;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//getter
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	
	
	
	public void incrementRadius() {
		Circle ci = new Circle();
		
		ci.setRadius(1);
		ci.setPI(3.14);
		
		System.out.println("������ ���̴�: " + ci.getRadius());
		System.out.println("���� �ѷ���: " + (ci.getRadius()*2) * ci.getPI());
		System.out.println("���� ���̴�: " + ci.getRadius()*ci.getRadius()*ci.getPI());	
		
		for(int i=0; ;i++){
		ci.setRadius(i++);
		ci.setPI(3.14);
		
		System.out.println("������ ���� +1 :" + ci.getRadius());
		System.out.println("���� �ѷ���: " + (ci.getRadius()*2) * ci.getPI());
		System.out.println("���� ���̴�: " + ci.getRadius()*ci.getRadius()*ci.getPI());	
		}
	}
	
}

package silsub3.model.vo;

public class Circle {
	public static double PI =3.14;
	private static int radius;
	
	//�⺻������
	public Circle() {}
	//�Ű�����������
	public Circle(double pI, int radius) {
		super();
		PI = pI;
		this.radius = radius;
	}
	
	
	//getter, setter �޼ҵ�
	public double getPI() {
		return PI;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void incrementRadius() {
		Circle ci1 = new Circle();
		ci1.setRadius(3);
		System.out.println("������ 1���� �� ���� �ѷ� : " + ((ci1.getRadius()+1) + (ci1.getRadius()+1))*PI);
		System.out.println("������ 1���� �� ���� ���� : " + ((ci1.getRadius()+1)*2)*PI);
	}
	
	
	
}

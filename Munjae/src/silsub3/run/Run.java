package silsub3.run;

import silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle ci = new Circle();
		
		ci.setRadius(3);
		
		System.out.println("���� �ѷ�: "+(ci.getRadius()+ci.getRadius())*2);
		System.out.println("���� ����: " + (ci.getRadius())*2);
		
		ci.incrementRadius();
	}

}

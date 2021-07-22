package silsub4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	
	public Student(int grade, int classroom, String name, double height, char gender) {
		this.grade=grade;
		this.classroom=classroom;
		this.name=name;
		this.height=height;
		this.gender=gender;
	}
	
	//setter
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	
	public void setClassRoom(int classroom) {
		this.classroom=classroom;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public void setHeight(double height) {
		this.height=height;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	//getter
	
	public int getGrade() {
		return grade;
	}
	public int getClassRoom() {
		return classroom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char setGender() {
		return gender;
	}
	
	public String information() {
		System.out.println("�г���: " +grade);
		System.out.println("����: " + classroom);
		System.out.println("�̸���: " + name);
		System.out.println("Ű��: " +height);
		System.out.println("������: " +gender);
		
		
		return "";
	}
	
}

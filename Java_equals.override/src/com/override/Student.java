package com.override;

public class Student {
	//�ʵ�
	private String name;
	
	//�⺻������
	public Student() {}

	
	//�Ű����� ������
	public Student(String name) {
		this.name = name;
	}
	
/*
	//��������
	@Override
	public boolean equals(Object obj) {
		Student s =(Student)obj;
		return this.name == s.name;
	}
//		equals��� �޼ҵ带 ����������� obj��� �Ű������� name�� �־�
//		�ڽ� Ŭ������ ����ȯ�� ��Ų�Ŀ� ���ϰ�����
//		�ʵ尪�� ����ȯ��Ų name���� ���Ѵ�
	*/
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj==null) {
			return false;
			
		}
		
		Student other = (Student)obj;
		
		if(this.name == null) {
			if(other.name!=null) {
				return false;
			}
		}
			
		
		if(!this.name.equals(other.name)) {
			return false;
		}
		
		
		
		
		
		
		
		
		
		
		return true;
	}
	
	
	@Override
	public int hashCode() {
		return (name).hashCode();
	}
	
	
	
public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("���ȣ");
		
		Student s3 = new Student("egoing");
		Student s4 = new Student("���ȣ");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
	}

}

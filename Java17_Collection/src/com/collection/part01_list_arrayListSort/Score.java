package com.collection.part01_list_arrayListSort;


public class Score implements Comparable<Score> {
	private String name;
	private int score;
	
	public Score() {}
	public Score(String name, int score) {
		this.name =name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Score o) {
		//name���� �⺻����
		String otherName = o.getName();
		// int flag = name.compareTo(otherName);
		// return flag;
		return name.compareTo(otherName);
		//����� �����ϸ� �ٲ۴�, ������ �����ϸ� �״��.
		
		
		
		
		//System.out.println(i.compareTo(i2));
		//0�� ���ؼ� ������, ����� i�� Ŭ��, ������ i2��Ŭ��
		
		//"��".compareTo("��");	  => ��� ���� ���Ϲ޴´�.
		//�տ����� ũ�� ������̳��´�.  << "��"
		//�ڿ����� ũ�� �������̳��´�.  << "��"�� Ŭ��
		
		//-"��".compartTo("��"); => -�� �ٿ������μ� ������ ���Ϲ޴´� (�տ� ���� Ŭ��)
		
	}
	
	
	
	
	
	
	
	
	
}

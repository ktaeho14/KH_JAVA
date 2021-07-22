package com.collection.part02_set;


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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
}

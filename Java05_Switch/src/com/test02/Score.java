package com.test02;

public class Score {

	public double getAvg(int kor, int eng, int math) {
		//�Ű� ������ �Ѿ���� 3������ ��� ������ ���� ����
		
		double avg = (double)(kor+eng+math)/3;
		return avg;
		
		
		
		
		
		
	}
	
	
	public String getGrade(double avg) {
		//�Ű������� �Ѿ���� ��� ������ ����� ���Ͽ� ����
		//100~90 : A
		//89~70  : B
		//69~50  : C
		//default : F
		//switch�� ���
		String grade="";
		
		
		
		
		switch((int)avg/10) {
		case 10:
		case 9:
			grade="A";
		break;
		
		case 8:
		case 7:
			grade="B";
		break;
		
		case 6:
		case 5: 
			grade="C";
		break;
		
		default:
			grade="F";
			
		}
		return grade;
	}
	
	
	
}

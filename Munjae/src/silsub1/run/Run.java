package silsub1.run;

import silsub1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member m = new Member();
		m.setAge(1);
		m.setEmail("ktaeho14@naver.com");
		m.setGender('��');
		m.setMemberId("sooho");
		m.setMemberName("���ȣ");
		m.setMemberPwd("fkvltm12");
		m.setPhone("01091967013");
		
		System.out.println("Member�� ���� : " + m.getAge());
		System.out.println("Member�� �̸��� : " +m.getEmail());
		System.out.println("Member�� ���� : " +m.getGender());
		System.out.println("Member�� ���̵� : " +m.getMemberId());
		System.out.println("Member�� �̸� : " +m.getMemberName());
		System.out.println("Member�� ��й�ȣ : " +m.getMemberPwd());
		System.out.println("Member�� ��ȣ : " +m.getPhone());
	
	
	
	
	
	
	
	
	
	}

}

package silsub.run;

import silsub.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		//1.��ü ����
		Member mem  = new Member();
		
		//2.setter�� �� ����(����)
		mem.setMemberId("admin");
		mem.setMemberPwd("1234");
		mem.setMemberName("ȫ�浿");
		mem.setAge(21);
		mem.setGender('��');
		mem.setPhone("01091967013");
		mem.setEmail("ktaeho14@naver.com");
		
		
		
		
		
		
		//3.getter�� �� ��ȸ
		System.out.println(mem.getMemberId());
		System.out.println(mem.getMemberPwd());
		System.out.println(mem.getMemberName());
		System.out.println(mem.getAge());
		System.out.println(mem.getGender());
		System.out.println(mem.getPhone());
		System.out.println(mem.getEmail());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

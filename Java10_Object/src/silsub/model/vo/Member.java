package silsub.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	public  Member() {
		
	}
	
	
	
	
	//setter method
		//�ʵ� �� ������ ���� ����ϴ� �޼ҵ�
		
	
	//setter �޼ҵ�� �Ű������� �̿��Ͽ� �ʵ忡 ���� �����ϰڴ�!������
	
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		
		public void setMemberPwd(String memberPwd) {
			this.memberPwd = memberPwd;
		}
		
		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public void setPhone(String phone) {
			this.phone=phone;
		}
		public void setEmail(String email) {
			this.email=email;
		}
		
		
		
		
		
		//getter�޼ҵ�� ��� ������ �ްڴ� ��� ��������
		
		
	//getter method
		//�ʵ尪�� Ȯ���ϱ� ���� ����ϴ� �޼ҵ�
	public String getMemberId() {
		return memberId;
	}
	
	public String getMemberPwd() {
		return memberPwd;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	
	
	
	
	
	
}

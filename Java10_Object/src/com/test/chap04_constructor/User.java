package com.test.chap04_constructor;

import java.util.Date;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private Date regDate;
	
	//�⺻������
	public User() {
		
	}
	
	//�Ű����� ������ (�����ε� �̿�)
	public User(String userId, String userPwd, String userName) {
		 this.userId = userId;
		 this.userPwd = userPwd;
		 this.userName = userName;
	
	}
	
	public User(String userId, String userPwd, String userName, Date regDate) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		
		this(userId, userPwd, userName);
		this.regDate = regDate;
		
		
		
	}
	
	
	//setter /getter �ۼ�
	/*private�� ������ �Ǿ��ִ°��� �ҷ��������� ����
	 * setter(���� �����ϰ���� ���� �����ϴ� ���)
	 * getter(����Ǿ��ִ� ���� �����´�)
	 */
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public Date getUserRegDate() {
		return regDate;
	}
	
	// -----
	public void setUserId(String userId) {
		this.userId= userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	//��¿� �޼ҵ�
	public void prn() {
		System.out.println(userId + "," + userPwd + "," + userName + "," + regDate );
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	


package com.test01.after;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		TeleVision t = new TeleVision("�Ｚ","03","t-321","�Ｚtv",50000,new Date(),46);
		
		System.out.println(t.prn());
		
		Desktop d = new Desktop("�Ｚ","01","s-123","�Ｚ��ǻ��",10000,new Date(),"i9",500,16,"window",false);
		
		System.out.println(d.prn());
		
		SmartPhone s = new SmartPhone("�Ｚ","02","g-321","������s21",800000, new Date(), "����",1024,16,"android","KT");
		System.out.println(s.prn());
		
		System.out.println(s.getBrand());
	
	}

}

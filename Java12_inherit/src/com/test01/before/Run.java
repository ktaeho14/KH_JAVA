package com.test01.before;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		Desktop d = new Desktop("�Ｚ", "01","S-123","�Ｚ��ǻ��","i9",500,16,"window10"
									,1000000,new Date(),false);;
		
		SmartPhone s = new SmartPhone("�Ｚ","02","G-1234","������21","����",500,16,
										"android",800000,new Date(),"SK");
		
		TeleVision t = new TeleVision("LG","03","T-321","LG TV",5000000,new Date(),46);
		
		d.prn();
		s.prn();
		t.prn();
		
	}

}

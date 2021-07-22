package com.chap05_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Run {
	/*
	 * 1. Date
	 * 2. Calendar
	 * 3. GregorianCalendar	leapYear
	 * 4. SimpleDateFormat
	 * 5. Formatter
	 */
	
	
	
	
	public static void main(String[] args) {
		
//	String originTime = new Date(1000L).toGMTString();	
//	System.out.println(originTime);
	
		Date today = new Date();
		System.out.println(today);
		
		//���ϴ� �������� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
		System.out.println(sdf.format(today));

		System.out.println("-------Ķ����----------");
		
		Calendar cal = Calendar.getInstance(); //���� �ð�
		System.out.println(cal);
		
		cal.set(2020, 2-1, 22);
		
		System.out.println(cal);
		
		int year = cal.get(2);
		int month = cal.get(Calendar.MONTH) +1 ;
		int date = cal.get(Calendar.DATE);
		
		System.out.println(year+"�� "+ month + "��" + date + "��");
		
		System.out.println(cal.getTime());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		
		cal.add(Calendar.YEAR, -9);
		cal.add(Calendar.MONTH, -3);
		
		System.out.println(cal.getTime());
		
		//Ÿ����
//		for(String name : TimeZone.getAvailableIDs()) {
//			System.out.println(name);
//		}
		
		//	Etc/Greenwich
		
		System.out.println("================");
		TimeZone tz = TimeZone.getTimeZone("Etc/Greenwich");
		sdf1.setTimeZone(tz);
		System.out.println(sdf1.format(cal.getTime()));
		
		
		
		System.out.println("=======�׷����� Ķ����=======");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
	}
	
	
	
	
	
	
	

}

package com.io.fileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		
		File file = new File("person.txt");
		System.out.println("���ϸ�" + file.getName());
		System.out.println("������: " +file.getAbsolutePath());
		System.out.println("������: " +file.getPath());
		System.out.println("���Ͽ뷮: " +file.length());
		System.out.println("��������: " +file.getParent());
		
		
		try {
			boolean b = file.createNewFile();
			
			System.out.println(b);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

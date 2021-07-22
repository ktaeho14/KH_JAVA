package com.io.part03_addStream.chap01_byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStream {
	
	
	
	public void input() {
		//System.in => inputStream ��ü
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
				// new ���� ��Ʈ��(new ������Ʈ��(new ��� ��Ʈ��(�ܺ��ڿ�) );
		
		System.out.println("���ڿ� �Է�: ");
		try {
			String value = br.readLine();
			
			System.out.println("value: "+ value);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	public void output() {
		
		BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java oracle jdbc");
			
			bw.flush();
			//���ۿ� �ܷ��� �ִ� ������ �о�� ���� ���
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}

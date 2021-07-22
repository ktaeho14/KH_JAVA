package com.io.part01_byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	
	public void fileOpen() {
		//���Ϸκ��� byte������ �����͸� �о� �� �� �ִ� ��Ʈ��
		FileInputStream fin = null;
		
		try {                          //�ܺ��ڿ� �ۼ�
			fin = new FileInputStream("sample.txt");

			
			
			
			/*			//File ��ü�� ����� ������ ũ�� ��������
	
			int fileSize = (int)new File("sample.txt").length();
			
			//������ �о� ������ byte �迭 ����
			byte[] bar = new byte[fileSize];
			
			fin.read(bar);
			
			for(int i =0; i<bar.length; i++) {
				System.out.print((char)bar[i] + " ");
			}
*/
			
			//val������ ��Ƽ� while��ó�����Ѵ�.
			int val =0;
			while((val=fin.read()) != -1) {
				System.out.print((char)val+ " ");
			}
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
	public void fileSave() {
		FileOutputStream  fout = null;
		
		try {
			fout = new FileOutputStream("sample.txt");
		
			fout.write(97);
		
			byte[] bar = {98, 99, 100, 101, 102};
			fout.write(bar);
			
			fout.write(10);
			fout.write(bar,1,3);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				System.out.println("��¿Ϸ�!");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	
	
	
	
	
	
	
	}
	
	public void fileSave2() {
		//try with resource
		//try(��ü����){}catch(){}
		//close������ ���� �� �ִ�
		
		
		
		try(FileOutputStream fout = new FileOutputStream("sample.txt");) {
			
		
			fout.write(97);
		
			byte[] bar = {98, 99, 100, 101, 102};
			fout.write(bar);
			
			fout.write(10);
			fout.write(bar,1,3);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 
	
	
	
	
	
	
	
	}
	
	
	
	
	
}

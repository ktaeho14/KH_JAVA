package com.io.part03_addStream.chap03_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {

	//������ �ڷ��� ���� ó���ϴ� ����� �߰��� ������Ʈ��
	public void fileSave() {
		
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"));) {
			
			//���Ͽ� �ڷ������� ���
			dout.writeUTF("���ȣ");
			dout.writeInt(95);
			dout.writeChar('A');
			//
			dout.writeUTF("ȫ�浿");
			dout.writeInt(77);
			dout.writeChar('C');
			dout.writeUTF("�̼���");
			dout.writeInt(87);
			dout.writeChar('B');
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			
		
		
		
		
	}
	
	
	public void fileOpen() {
		try(DataInputStream din = new DataInputStream(new FileInputStream("score.txt"));) {
			
			while(true) {
				System.out.println(din.readUTF() + "," +din.readInt() +"," + din.readChar());
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	catch(EOFException e) {
			System.out.println("���� �б� �Ϸ�");
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
}

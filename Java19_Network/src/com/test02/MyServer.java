package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MyServer {
	public static void main(String[] args) throws IOException {
	//��������
		DatagramSocket ds = new DatagramSocket(9999);
		//9999��� ��Ʈ��ȣ
		
		// ���� �� ����
		byte[] buff = new byte[1024];
		
		
		// ��Ŷ�� ����
		DatagramPacket recieveP = new DatagramPacket(buff,buff.length); 
		ds.receive(recieveP);
		System.out.println( new String(recieveP.getData()) );
		//����
		ds.close();
		ds.disconnect();
	
	
	}
	
	
	
}

package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) throws IOException {
		//��������
		ServerSocket serverSocket = null;
		
		//���ӵ� Ŭ���̾�Ʈ�� ����
		Socket serviceSocket = null;
		
		//��°�ü
		PrintWriter out = null;
		
		//Ŭ���̾�Ʈ�κ��� �о�帰 ������ ���ۿ� ���� ��ü
		BufferedReader in = null;
		
		
		serverSocket = new ServerSocket(8888);
		System.out.println("======SERVER=======");
		
		
		while(true) {
			System.out.println("client�� ��ٸ��ϴ�.");
			
			serviceSocket = serverSocket.accept();
			
			//1. client���� ���� ������ ���δ����� �о
			in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
			
			//2. �����ְڴ�.
			out = new PrintWriter(serviceSocket.getOutputStream(),true);
			
			
			
			String inputLine = null;
			while( (inputLine=in.readLine()) !=null ) {
				System.out.println("Ŭ���̾�Ʈ�� ���� �޽���: " + inputLine);
			
				out.println("["+inputLine+"] �� �޾Ҿ�!");
			}
			
			out.close();
			in.close();
			serviceSocket.close();
			serverSocket.close();
			
			
			
			
			
			
		}
		
		
	}
	
	public void server() {
		int port =3000;
		ServerSocket server;
		
		try {
			server = new ServerSoket(8888);
			while(true) {
				Socket client = server.aceept();
			}
		}
	}

}

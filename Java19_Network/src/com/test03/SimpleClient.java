package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket clientSocket = null;
		
		PrintWriter out = null;
		
		BufferedReader in = null;
		//�����޼����� �ܼ�â���� �Է¹��� ���̴�.
		BufferedReader stdIn = null;
		
		System.out.println("====Client====");
		System.out.println("server�� ���� �մϴ�.");
		
		//�� ��ǻ�ͷ� ��������
		//clientSocket = new Socket("localhost", 8888);
		clientSocket = new Socket("127.0.0.1", 8888);
		
		
		out = new PrintWriter(clientSocket.getOutputStream(),true);
		
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		String inputLine = null;
		
		while( (inputLine = stdIn.readLine())!=null ) {
			out.println(inputLine);
			System.out.println("server�κ��� �ٽ� ���� �޽���: " + in.readLine());
		}
		
		stdIn.close();
		in.close();
		out.close();
		clientSocket.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

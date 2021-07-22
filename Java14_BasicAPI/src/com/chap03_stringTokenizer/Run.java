package com.chap03_stringTokenizer;

import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
		String str = "���ȣ,27,���� ���ı� ������, ��";
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		

	}

}

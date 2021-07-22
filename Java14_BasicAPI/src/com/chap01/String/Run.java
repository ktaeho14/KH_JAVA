package com.chap01.String;

public class Run {
	public static void main(String[] args) {
		
		Run.method1();
		//Run.method2();
	}
	public static void method1() {
		
		String str = "abc";
		String str1 = "abc";
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		
		
		String str2 = new String("abc");
		String str3 = new String("abc");
		
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	
		System.out.println("=============");
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		str3 = "def";
		System.out.println("============");
		System.out.println(System.identityHashCode(str3));
	
		
	}

	public static void method2() {
		String str = "abc";
		
		//charAt(index)
		System.out.println(str.charAt(0));
		//concat(��ġ��)
		System.out.println(str.concat("def"));
		//contains(���Կ���)
		System.out.println(str.contains("a"));
		System.out.println(str.contains("ab"));
		System.out.println(str.contains("ac"));
		
		//split(���ڱ���)
		String str1 = "a,b,c";
		String[] strArr = str1.split(",");
		
		for(String arr: strArr) {
			System.out.println(arr);
		}
		
		//subString(�߶󳻱�)
		System.out.println(str1.substring(0,3));
		
		//trim(���� ����)
		String str2 = "     ab    c    ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		
		
		
		
		
		
	}
	
	
	
	
}

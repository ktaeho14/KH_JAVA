package com.chap02_StringBuffer_StringBuilder;

public class Run {

	public static void main(String[] args) {
		Run.method();
		//Run.method1();
	}

	
	public static void method() {
	
		StringBuilder sb = new StringBuilder("�ƾ� �ϳ���");
		System.out.println(sb.length());
		System.out.println(sb);
		
		System.out.println("=================");
		System.out.println("sb ����: +" + sb + ", �ּ�: " + sb.hashCode());
		sb.append("�ϳ��� �鸮����~");
		System.out.println("sb ������:  +" + sb + ", �ּ�: " +sb.hashCode());
		
		System.out.println("---------------------------");
		
		StringBuffer sf = new StringBuffer("�ȳ�!");
		System.out.println("sf ����: " + sf + ", �ּ�:" + sf.hashCode() );
		sf.append(" ���� StringBuffer��");
		System.out.println("sf ������: "+sf+", �ּ�: "+sf.hashCode());
		
		
		
	}
	
		public static void method1() {
			StringBuilder sb = new StringBuilder("3���� ");
			
			//append
//			sb.append(" ���� �� �Դϴ�");
//			sb.append("~~!");
			sb.append("���� �� �Դϴ�").append("~~!");	//�޼ҵ� ü�̴�
			
			System.out.println(sb);
			
			//insert()
			sb.insert(0, "ȭ���� ");
			System.out.println(sb);
			
			//delete()
			sb.delete(0, 4);
			System.out.println(sb);
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

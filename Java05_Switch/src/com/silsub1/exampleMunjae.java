package com.silsub1;


import java.util.Scanner;

public class exampleMunjae {

		public void test1() {
		Scanner sc = new Scanner(System.in);	
			
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			
			int sum = kor+eng+math;
			System.out.println("����,����,���� ���� �հ�: " + sum);
			
			
			int avg = sum/3;
			System.out.println("3������ �������: " + avg);
			
			if(avg>=60) {
				if(kor>=40) {
					if(eng>=40) {
						if(math>=40) {
							System.out.println("�հ�    " +"����: "+kor+ "����: "+eng +"����: "+math + "�հ�: "+sum+"���: " + avg);
										}else {
									System.out.println("���հ�");
								}
							}else {
							System.out.println("���հ�");
						}
					}else {
						System.out.println("���հ�");
				}
			}else {
				System.out.println("���հ�");
	}
			
}
		
		public void test2() {
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			
			System.out.println("���Ͻô� ��ȣ�� �Է����ּ���");
			System.out.println("***�ʱ� �޴�***");
			System.out.println("1. �Է�");
			System.out.println("2. ����");
			System.out.println("3. ��ȸ");
			System.out.println("4. ����");
			System.out.println("7. ����");
		
			int st = sc.nextInt();
			
			switch(st) {
			case 1: 
				System.out.println("�Է¸޴��� ���õǾ����ϴ�");
			break;
			
			case 2:
				System.out.println("�����޴��� ���õǾ����ϴ�");
			break;
			
			case 3:
				System.out.println("��ȸ�޴��� ���õǾ����ϴ�");
			break;
			
			case 4:
				System.out.println("�����޴��� ���õǾ����ϴ�");
			break;
			
			case 7:
				System.out.println("���α׷��� ����˴ϴ�");
			return;
			
			default:
				System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�."  +"\n�ٽ� �Է��Ͻʽÿ�");
		
				}
			
			}
		
		}
		public void test3() {
			Scanner sc = new Scanner(System.in);
	
			System.out.println("���� �� ���� �Է��ϼ���: ");
			int num = sc.nextInt();
			
			if(num>0) {
				System.out.println("�����");
			}else {
				System.out.println("����� �ƴϴ�");
			}
			
		}
		
		public void test4() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("������ �� ���� �Է��ϼ���: ");
			
			int num = sc.nextInt();
			String str = "¦����";			
			String str2 = "Ȧ����";
			
			
			if(num>0 && num%2==0) {
				System.out.println(str);
			}else {
				System.out.println(str2);
			}
			
			
			
		}
		
		public void test5() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�̸�: " + "����: " + "Ű: " +"�� �Է��ϼ���");
			
			
			String name = sc.next();
			int age = sc.nextInt();
			double hei = sc.nextDouble();
			
			if(name!=null && name.length()>0) {
				
			}if(age>0) {
				
			}if(hei>0) {
				System.out.println(name + "�� ���̴�" + age + "�� ��, Ű��" + hei + "cm�̴�.");
			}else {
				System.out.println();
			}
			
			
			
			
		}
		
		public void test6() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�� ���� ������ �Է��ϼ���");
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
		
			
			int num3 = num1 + num2;
			int num4 = num1 - num2;
			int num5 = num1 * num2;
			int num6 = num1 / num2;
			int num7 = num1 % num2;
			
			
		System.out.println("ù���� ����: " + num1);
		System.out.println("�ι��� ����: " + num2);
			
		
		if(num1>0 && num2>0) {
			System.out.println(num1+ " + " + num2 + " = " + num3);
		}		 if(num1>0 && num2>0) {
			System.out.println(num1 + " - " + num2 + " = " + num4);
				}if(num1>0 && num2>0) {
			System.out.println(num1 + " * " + num2 + " = " + num5);
				}if(num1>0 && num2>0) {
			System.out.println(num1 + " / " + num2 + " = " + num6);					
				}if(num1>0 && num2>0) {
			System.out.println(num1 + " % " + num2 + " = " + num7);		
				}
			
		}
		public void test7() {
			Scanner sc = new Scanner(System.in);
			System.out.println("������ �Է��ϼ���");
			
			int score = sc.nextInt();
			
			String grade = "ABCDF";
			
			if(score>=90) {
				System.out.println("����: " + score + "����" + grade.charAt(0));
			} if(score>=80 && score<90) {
				System.out.println("����: " + score + "����" + grade.charAt(1));
			} if(score>=70 && score<80) {
				System.out.println("����: " + score + "����" + grade.charAt(2));
			} if(score>=60 && score<70) {
				System.out.println("����: " + score + "����" + grade.charAt(3));
			} else if(score<60)  {
				System.out.println("����: " + score + "����" + grade.charAt(4));
			}
			
			
		
		
		
		}
		
		public double test8(double b) {
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b1 = (int)b;
			System.out.println(a+b1);
			
			return b;
			
		}
}

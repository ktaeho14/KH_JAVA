package com.poly.part01.test04;

public class MTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Eagle eagle = new Eagle();
		
		cat.bark();
		cat.eat("������");

		
		dog.bark();
		dog.bite();
		dog.eat("����");
		
		eagle.bark();
		eagle.eat("�䳢");
		eagle.fly();
	}

}

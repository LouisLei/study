package com.lakala.work.design.decorator;

/**
 * װ����ģʽ �����еĶ���������������
 */
public class Owner implements Animal {

	private Animal animal;

	@Override
	public void sayHello() {
		System.out.println("Before say hello");
		animal.sayHello();
		System.out.println("After say hello");
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Owner() {

	}

	public Owner(Animal animal) {
		this.animal = animal;
	}

}

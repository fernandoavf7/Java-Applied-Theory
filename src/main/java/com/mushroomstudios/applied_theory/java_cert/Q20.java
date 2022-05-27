package com.mushroomstudios.applied_theory.java_cert;

abstract class Animal {
	private String name;

	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Dog extends Animal {
	private String breed;

	Dog(String breed) {
		super("noname");
		// super("noname");// you should add this line to compile Dog class because the
		// animal class has a constructor that needs
		this.breed = breed;
	}

	Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}
}

public class Q20 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Beagle");
		Dog dog2 = new Dog("Bubbly", "Poodle");
		System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" + dog2.getName() + ":" + dog2.getBreed());
	}
}

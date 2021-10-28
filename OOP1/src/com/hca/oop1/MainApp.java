package com.hca.oop1;

public class MainApp {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		animal1.setName("SK");
		
		Animal animal2 = new Animal("SK Jr");
		
		Dog dog1 = new Dog();
		dog1.setName("Jack Buster");
		dog1.setBreed("Beagle");
		
		Dog dog2 = new Dog("Fido");
		
		Dog dog3 = new Dog("Rubby", "Corgi");

		
		System.out.println("Animal 1's name is " + animal1.getName());
		System.out.println("Animal 2's name is " + animal2.getName());
		
		System.out.printf("Dog 1's name is %s and breed is %s\n", dog1.getName(), dog1.getBreed());
		dog1.bark();
		
		System.out.printf("Dog 2's name is %s and breed is %s\n", dog2.getName(), dog2.getBreed());
		dog2.bark();
		
		System.out.printf("Dog 3's name is %s and breed is %s\n", dog3.getName(), dog3.getBreed());
		dog3.bark();

	}

}

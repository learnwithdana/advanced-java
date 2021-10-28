package com.hca.oop1;

public class MainApp {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setName("SK");
		
		Dog dog = new Dog();
		dog.setName("Jack Buster");
		dog.setBreed("Beagle");
		
		System.out.println("Animal's name is " + animal.getName());
		
		System.out.printf("Dog's name is %s and breed is %s\n", dog.getName(), dog.getBreed());

	}

}

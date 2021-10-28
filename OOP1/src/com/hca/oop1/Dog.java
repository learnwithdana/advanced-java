package com.hca.oop1;

public class Dog extends Animal {
	private String breed;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void bark() {
		System.out.println("Woof!");
	}
}

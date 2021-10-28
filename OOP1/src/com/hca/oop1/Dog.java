package com.hca.oop1;

public class Dog extends Animal {
	private String breed;   // default value = null
	
	public Dog() {
		//super();
		System.out.println("Trace -- in Dog() c'tor");
		this.breed = "";  // null bad, this better
	}
	
	public Dog(String name) {
		super(name);
		System.out.println("Trace -- in Dog(name) c'tor");
		
		this.breed = "";  // null bad, this better
	}
	
	public Dog(String name, String breed) {
		super(name);
		System.out.println("Trace -- in Dog(name. breed) c'tor");
		
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void bark() {
		System.out.println(getName() + " says \"Woof\"!");
	}
}

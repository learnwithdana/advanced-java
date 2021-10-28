package com.hca.oop1;

public class Animal {
	private String name;

	public Animal() {
		// still letting animal data members have their default values
		System.out.println("Trace -- in Animal() c'tor");
	}
	
	public Animal(String name) {
		System.out.println("Trace -- in Animal(name) c'tor");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.trim().equals("")) {
			this.name = name;
		}
	}
	
	public void move() {
		System.out.println("Move, move, move...");
	}
}

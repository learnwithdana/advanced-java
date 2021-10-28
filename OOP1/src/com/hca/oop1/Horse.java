package com.hca.oop1;

public class Horse extends Animal {
	
	private String owner;

	public Horse(String name, String owner) {
		super(name);
		System.out.println("Trace -- in Horse(name, owner) c'tor");
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void move() {
		System.out.println("Clop, clop, clop...");
	}

	//@Override
	public String toString() {
		return String.format("%s [name=%s owner=%s]", getClass(), getName(), owner);
	}	

}

package com.hca.oop1;

import java.util.ArrayList;

public class MainApp {

	public static void skiddatle(Animal animal) {
		System.out.print(animal.toString() + ": ");
		System.out.print(animal.getName() + " --> ");
		animal.move();   // it just "knows" which version of move to call
		                 // based on the type of object (dog? horse?) passed in
	}
	
	public static void main(String[] args) {
		
		ArrayList<Animal> myList = new ArrayList<Animal>();
		
		Dog d = new Dog("Fido", "Pug");
		myList.add(d);
		
		myList.add( new Dog("Rubby", "Corgi")  );
		myList.add( new Dog("Howdy", "Mutt")  );
		
		myList.add( new Horse("Cody", "Dana")  );
		myList.add( new Horse("Bullet", "Cindy")  );
		
		myList.add( new Dog("Happy", "Goldern Retriever")  );
		
//		for(int i = 0; i < myList.size(); i++) {
//			skiddatle(myList.get(i));
//
////			myList.get(i).move();
//			
////			Animal a = myList.get(i);
////			a.move();
//		}
		
		for(Animal animal : myList) {
			skiddatle(animal);
			
			// animal.move();
		}
		
		/*  DEMO 3 -- first glance at polymorphism
		 
		Dog dog = new Dog("Fido", "Pug");
		Horse horse = new Horse("Cody", "Dana");
		
		skiddatle(dog);
		skiddatle(horse);

		*/
		
		
		/*   DEMO 2 -- Base class variables can hold derived class objects
		              but not vice versa
		              ex:  a dog IS AN animal, but an animal MIGHT NOT BE a dog
		 
		Animal generic = new Dog("Happy", "Golden Retriever");   // upcasting  (always safe)
		
		Dog myDog = (Dog) generic;           // explicit downcasting  (dangerous)
		*/
		
		
		
		/*   DEMO 1 with constructors
		Animal animal1 = new Animal();
		animal1.setName("SK");
		
		Animal animal2 = new Animal("SK Jr");
		
		
		Dog dog1 = new Dog();
		dog1.setName("Jack Buster");
		dog1.setBreed("Beagle");
		
		System.out.printf("Dog 1's name is %s and breed is %s\n", dog1.getName(), dog1.getBreed());
		dog1.bark();
		
		
		Dog dog2 = new Dog("Fido");
		
		Dog dog3 = new Dog("Rubby", "Corgi");

		System.out.println("Animal 1's name is " + animal1.getName());
		System.out.println("Animal 2's name is " + animal2.getName());
		

		
		System.out.printf("Dog 2's name is %s and breed is %s\n", dog2.getName(), dog2.getBreed());
		dog2.bark();
		
		System.out.printf("Dog 3's name is %s and breed is %s\n", dog3.getName(), dog3.getBreed());
		dog3.bark();
		
		*/

	}

}

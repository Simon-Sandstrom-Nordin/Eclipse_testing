package Eclipse_testing.testwhoo;

import java.util.Random;

public class Dogge {

	static class Animal {
	    void makeSound() {
	        System.out.println("Some sound");
	    }
	}

	static class Dog extends Animal {
	    void makeSound() {
	        System.out.println("Bark");
	    }
	}
	
	static class Cat extends Animal {
	    void makeSound() {
	        System.out.println("Mjao");
	    }
	}

	public static void main(String []args) {
		Random random = new Random();
		int randint = random.nextInt(2);
		
		Animal myAnimal = null;
		if (randint == 0) {
			myAnimal = new Dog();
		} else if (randint == 1) {
			myAnimal = new Cat();
		}
		
		// Using the superclass reference to refer to a subclass object
		myAnimal.makeSound(); // Calls Dog's makeSound() method
	}
}


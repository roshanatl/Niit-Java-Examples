package com.niit.abstartInterfaceSingleton;

/**
 *
 * @author Roshan
 */
public class JavaApplication118 {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		// Abstract class used to
		Animal doganimal = new Dog();
		Animal catanimal = new Cat();
		doganimal.makeSound();
		catanimal.makeSound();

		Dog dog = (Dog) doganimal;
		Cat myCat= (Cat)catanimal;

		dog.move();
		myCat.move();

		Car car1,car2;
		Bike myBike = Bike.getInstance();
		car1 = Car.getInstance();
	    car2 = Car.getInstance();
	    
		

		car1.drive();
		myBike.drive();
		
		makeItMove(car2);
		if (dog instanceof Movable) {
			makeItMove(dog);
		}		
		makeItMove(myCat);
		makeItMove(myBike);

		System.out.println(Car.counter);

	}

	static void makeItMove(Movable m) {
		m.move();
	}

}

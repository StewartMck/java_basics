package inheritance;

public class Car extends Vehicle {
	
	// Car is child / subclass & inherits all base functionality from parent
	// Car is a vehicle (is-a-relationship)
	// Child can only extend from 1 parent class
	
	
	public Car(String name, int hp) {
		// super class constructor called	
		super(name, hp);
	}

	@Override
	public void drive() {
		System.out.println("Car is driving");
		
	}

}

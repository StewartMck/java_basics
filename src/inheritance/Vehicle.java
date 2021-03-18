package inheritance;

public abstract class Vehicle {
	
	/*
	 * Vehicle is an abstract class, can only be extended and
	 * not instantiated.
	 * Used for inheritance
	 * All methods must be implemented.
	 */
	
	// Vehicle is super / parent class

	
	String name;
	int hp;
	
	public Vehicle(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	// abstract method, no body - abstracts idea of drive
	public abstract void drive();
	

}

package oop;

public class Human {
	
	// state is stored in variables and behaviour is defined by methods
	// Class defines a specification of an object / blueprint
	
	String name;
	int age;
	int heightInInches;
	String eyeColour;
	
	//constructor, no return type, name as class name
	//this = points to current instance, variable that references current instance
	public Human(String name, int age, int heightInInches, String eyeColour) {
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColour = eyeColour;
	}
	
	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am " + heightInInches + " inches tall");
		System.out.println("I am " + age + " years old");
		System.out.println("My eye colour is " + eyeColour);
	}
	
	public void eat() {
		System.out.println("eating");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void work() {
		System.out.println("working...");
	}
	
	

}

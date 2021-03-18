package inheritance;

public class Motorcycle extends Vehicle implements Jumpable {
	
	// Class can implement many interfaces but only extend
	// 1 class
	
	public Motorcycle(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void drive() {
		System.out.println("Zooooooom");
	}
	
	public void jump() {
		System.out.println("Jumping, whooooo!");
	}

}

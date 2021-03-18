package inheritance;

public class Main {
	
	public static void main(String [] args) {
		
		// can create objects of type car but variable type is Vehicle
		// Objects exist during runtime
		
		Vehicle toyota = new Car("Toyota", 120);
		toyota.drive();
		
		Vehicle ducatti = new Motorcycle("Ducatti", 400);
		ducatti.drive();
		// ducatti.jump();
		
		park(ducatti);
		park(toyota);
		
		
		// Interface is type and can create instance of
		// ktm ref var points to Motorcycle obj but is of type Jumpable
		Jumpable ktm = new Motorcycle("KTM", 220);
		
		ktm.jump();
			
	}
	
	// polymorphism
	// represents general idea of vehicle being able to move
	// Method argument will accept Parent and Child objects
	public static void park(Vehicle vehicle) {
		vehicle.drive();
	}

}

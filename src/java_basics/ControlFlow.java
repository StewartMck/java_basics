package java_basics;

public class ControlFlow {
	
	public static void main(String [] args) {
		
		// If, else --> branch out to different directions
		
		boolean hungry = false;
		
		// == comparison operator, hungry == true, ! = negation operator --> !false = true
		
		if(!hungry) {
			System.out.println("I am starving");
		} else {
			System.out.println("I am not hungry");
		}
		
		
		int hungerRating = 5;
		
		// ! is negating the expression (hungerRating<6)
		if(!(hungerRating < 6)) {
			System.out.println("Not Hungry");
		} else {
			System.out.println("I'm starving...");
		}
		
		int favouriteTemp = 75;
		int currentTemp = 60;
		String opinion;
		
		if(currentTemp < favouriteTemp - 30){
			opinion = "It's Pretty darn cold";
		} else if (currentTemp < favouriteTemp - 20) {
			opinion = "It's kinda cold out...";
		} else if (currentTemp > favouriteTemp + 10) {
			opinion = "It's hot out";
		} else {
			opinion = "It's a beautiful day...";
		}
		
		System.out.println(opinion);
		
		
		int month = 2;
		String monthString;
		
		switch(month) {
		case 1: 
			monthString = "January";
			break;
		case 2: 
			monthString = "February";
			break;
		case 3: 
			monthString = "March";
			break;
		default: 
			monthString = "Invalid Input";
		}
		
		System.out.println(monthString);
		
	}

}

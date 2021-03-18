package strings;

public class StringsPractice {
	
	public static void main(String [] args) {
		
		// String = sequence of characters, 0 indexed
		String a = "hello";
		// .length is method here where in array is a property
		System.out.println(a.length());
		
		
		// substring method - If not specify ending, then will use argument as start till end. Ending arg not inclusive
		String str = "ABCDEFG";
		String extracted = str.substring(0, 3); //start @ index 0 and end @ index 3 (exlcd) --> ABC
		System.out.println("Extracted string: " + extracted);
		
		String b = "hello";
		
		// Objects use equals method for comparison. Checks value and address.
		// equalsIgnoreCase()
		
		if(a.equals(b)) {
			System.out.println("It is equal!");
		} else {
			System.out.println("It's not equal!");
		}
		
		// charAt() --> if pass number larger than length will OutOfBoundsException
		System.out.println("Character: " + a.charAt(3));
		
		// primitive type to use single character
		char character = '}';
		
		// indexOf(String s), can pass as arg: index to start at. Searches L->R. Returns -1 if not found
		String testString = "Hello there yogi, how are you yogi";
		System.out.println("Where is 'yogi': " + testString.indexOf("yogi", 4));
		
		
		// lastIndexOf(String s) --> searches from R->L
		System.out.println("Where is the last index of yogi? " + testString.lastIndexOf("yogi"));
		
		
	}

}

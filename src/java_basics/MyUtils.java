package java_basics;

public class MyUtils {
	
	// Method overloading
		public static void printSomeJunk(String argument) {
			System.out.println("Printing from printSomeJunk Method: " +  argument);
		}
		public static int printSomeJunk(int argument) {
			return argument;
		}	
		
		
		public static void sum2Numbers(int firstArg, int secondArg) {
			System.out.println(firstArg + secondArg);
		}
		
		public static int add10(int someArg) {
			return someArg + 10;
		}
		
		public void printInstance() {
			System.out.println("Print from instance of MyUtils");
		}

}

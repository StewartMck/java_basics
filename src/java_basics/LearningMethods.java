package java_basics;

import someotherpackage.ExampleClass;

public class LearningMethods {
	
	/* 
		void = return type
		public = access modifier (manage visibility of methods & variables), class & method level
		main = String array of arguments, entry point to all java programs
		static = class method
		no-static = method belongs to instance of class
	*/
	public static void main(String [] args) {
		
		MyUtils.printSomeJunk("Hello from main");
		int myInt = MyUtils.printSomeJunk(34);
		System.out.println(myInt);
		MyUtils.sum2Numbers(2, 3);
		System.out.println(MyUtils.add10(10));
		
		System.out.println(ExampleClass.doSomething());
		
		// Object variable
		MyUtils myVar = new MyUtils();
		myVar.printInstance();
	
			
	
	}
	
	

}

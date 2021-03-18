package oop;

public class Earth {
	
	public static void main(String [] args) {
		
		/*
		 Running APP:
		 memory locations:
		 	Heap:	Objects are created and stored in the heap.  Reference variables point to object memory address in heap.
		 			Objects without a reference are garbage collected in heap
		 			Garbage collection is process that runs in Heap and removes unreferenced objects
		 	Stack:	Frame created housing main() method + variable addresses
		 			Further methods invocated are put on top of stack in new frame
		 			When method closes, frame is closed (taken from top of stack). Pops of stack
		 			Maintains method invocations --> Pile up on stack
		 */
		
		// Calling constructor method to create new object (instance of Human)
		// tom = reference variable of type Human - with reference to an object
		// object = Objects exist during application runtime & garbage collected when no more reference to them
		// when run app, memory is allocated to store objects and instance variables point to objects
				
		Human tom = new Human("Tom", 34, 51, "brown");
		tom.speak();
	}

}

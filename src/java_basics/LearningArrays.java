package java_basics;

public class LearningArrays {
	
	public static void main(String [] args) {
		
		// int of type array called values is new int obj with size of 100
		int [] values = new int [10];
				
		for(int i = 0; i < 10; i++) {
			values[i] = i+1;
		}

		for (int i : values) {
			System.out.println(i);
		}
		
		String [] words = new String[] {"A", "B", "C"};
		System.out.println(words[words.length - 1]);
		
	}
	

}

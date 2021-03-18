package strings;

public class Loops {
	
	public static void main(String [] args) {
		
		int count = 1;
		
		/*
		  while(test){
		  	body
		  }
		 */
		while(count <= 100) {
			
			// break; will end loop prematurely
			// continue; will skip over iteration
			
			if(!(count % 2 == 0)) {
				count++;
				continue;
			} 	
		
			System.out.println("Count:" + count++);
			
			if(count == 30) {
				System.out.println("Count has reached: " + count);
				break;
			}
		}
		
		
		
		
		
	}
}

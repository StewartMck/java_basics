package strings;

public class LoopsPractice {
	
	public static void main(String [] args) {
		
		String str = 	"We have a large inventory of things in our warehouse falling in " +
						"the category:appereal and the slightly " +
						"more in demand category:makeup along with the category:furniture and _. ";
		
		printCategories(str);
		
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.print("Printing the Alphabet: ");
		for(int i = 0; i < alphabet.length(); i++) {
			System.out.print(alphabet.charAt(i));
		}
		
		System.out.println();
		System.out.print("Printing the Alphabet in Reverse: ");
		for(int i = alphabet.length() - 1; i >= 0; i--) {
			System.out.print(alphabet.charAt(i));
		}
		
		System.out.println();
		printEvenNumbers(0, 100);
		
	}
	
	public static void printCategories(String str) {
				
		int index = 0;
		while(true) {
			int found = str.indexOf("category:", index);
			if(found == -1) {
				break;
			}
			
			int start = found + 9; //start of actual string: category: = 8
			int end = str.indexOf(" ", start);
			
			System.out.println(str.substring(start, end));
			index = end + 1;
			
		}
		
	
		}
	
	public static void printEvenNumbers(int begin, int end) {
		
		System.out.print("Printing Even numbers: ");
		for(int i = begin; i <= end; i++) {
			if(i % 2 == 0) {
				System.out.print(i + (i == end || i == end -1 ? "" : ", "));
			}
		}
		
	}
}

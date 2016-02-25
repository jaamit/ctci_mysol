
import java.util.HashSet;

/*
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 * 
 */
public class Question1_1 {
	
	// Use HashSet - A collection that contains no duplicate elements
	public static boolean isUniqueChars(String word){
		boolean unique = true;
		HashSet<Character> map = new HashSet<>();
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			 // If this set already contains the element, 
			//  the call leaves the set unchanged and returns false.
			if(!map.add(c)) { 
				unique = false;
				break;
				}
		}
		
		return unique;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));// + " " + isUniqueChars2(word));
		}
	}

}

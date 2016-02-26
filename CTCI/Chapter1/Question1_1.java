
import java.util.HashSet;
import java.util.Arrays;

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
	
	// Sort and then use 2 pointers to track if same char exists
	// worst-case O(N^2)..leave this brute-force is better then
	public static boolean isUniqueChars2(String word){
		/*char[] chars = word.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		int j = 1;
		int i = 0;
		while(i<sorted.length()-1){
			
		i++; j++;		
		}*/
		char[] chars = word.toCharArray();
		for(int i=0; i< chars.length; i++) {
			for(int j=0; j< chars.length; j++) {
				if((i!=j) && (chars[i] == chars[j])) {
					return false;
				}
			}
		}		
		return true;
	}
	
	// gayle's method -  boolean array indexed by char's ascii value
	public static boolean isUniqueChars3(String word){
		if(word.length() > 128) return false;
		boolean[] flag = new boolean[128];
		
		for(int i=0; i<word.length(); i++) {
			int idx = word.charAt(i);
			if(flag[idx]) {
				return false;
			} else {
				flag[idx] = true;
			}
		}		
		return true;
	}
	
	// gayle's method -  boolean array indexed by char's ascii value
	public static boolean isUniqueChars4(String word){
		if(word.length() > 128) 
			return false;
		
		int checker = 0;
		for(int i=0; i<word.length(); i++) {
			int val = word.charAt(i) - 'a';
			
			if( (checker & (1 << val)) > 0) return false;
			checker |= (1<<val);			
		}
				
		return true;
	}

	/* - TDD using JUnit 
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));// + " " + isUniqueChars2(word));
		}
	}
	*/

}

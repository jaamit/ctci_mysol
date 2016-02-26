import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

/* 
 * Write a method to decide if two strings are anagrams or not.
 */

public class Question1_4 {
	
	private static String sort(String s) {
		char[] chars = s.toLowerCase().toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		return sorted;		
	}

	// 1. sort and use equals
	public static boolean isAnagramSort(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		return sort(s1).equals(sort(s2));
		
/*      I did this but found gayle's code more modular
		char[] char1 = s1.toLowerCase().toCharArray();
		char[] char2 = s2.toLowerCase().toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		String sorted1 = new String(char1);
		String sorted2 = new String(char2);
		return sorted1.equals(sorted2);
		*/
	}
	
	// 
	
	// 2. Brute Force - check each char in both Strings (N^2)
	
	/* 3. Add chars of S1 in HashMap<Character, Counter++>
	 *    for S2 -- bit too complex and needs more code 
	
	*/
	public static boolean isAnagramHash(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();		
		
		HashMap<Character, Integer> map = new HashMap<>();
		// add s1 in the map
		for(Character c : s1.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		
		// iterate s2 now
		for(Character c : s2.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)-1);
			}  
		}
		
		for(Character c : s1.toCharArray()) {
			//System.out.println(c + " "+  map.get(c));
			if(map.get(c) != 0) return false;  
		}
		
		return true;		
	}

}

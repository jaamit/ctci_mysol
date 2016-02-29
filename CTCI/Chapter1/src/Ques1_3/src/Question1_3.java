//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* 
 * Design an algorithm and write code to remove the duplicate characters in a 
 * string without using any additional buffer. 
 * NOTE: One or two additional variables are fine. An extra copy of the array is not.
 * 
 * FOLLOW UP
 * Write the test cases for this method.
 *
 */

public class Question1_3 {
	
	/* 1. Use HashSet as it allows unqiue elems only
	 * However, not accepted as additional array copy is created...just for basic concept
	 * Use LinkedHashSet instead of HashSet to maintain the insertion order
	 * else {"bcdbdbcdbasbabccbdcbdsadas", "bcdas"} fails
	 */
	public static String removeDuplicatesHashSet(String str) {
		if(str == null || str.length() < 2) return str;
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		for(Character c : str.toCharArray()) {
			if(!set.contains(c)) set.add(c);
		}
		
		// set has unique elems - convert to output String
		for(Character c : set) {
			sb.append(c);
		}
		
		System.out.println(sb);
		return new String(sb);
	}
	
	// 2. Use boolean array as flag indicating char seen
	public static String removeDuplicatesBoolean(String str) {
		if(str == null || str.length() < 2) return str;
		boolean[] charSeen = new boolean[128];
		StringBuilder sb = new StringBuilder();
		
		for(Character c : str.toCharArray()) {
			if(charSeen[c]) continue;
			else {
				charSeen[c] = true;
				sb.append(c);
			}
		}
		
		return new String(sb);
	
	}
	
	/*// 2. Brute-force O(N^2) - two pointers checking each elem for duplicates
	
	
	public static String removeDuplicates(char[] str) {
		if(str == null || str.length < 2) return new String(str);
		
		int len = str.length;
		int tail = 1;
		
		for(int i = 1; i < len; i++) {
			int j;
			for(j = 0; j < tail; j++) {
				if(str[i] == str[j]) break;
				
			}
			if(j == tail) {
				str[tail] = str[i];
				++tail;
			}
			
		}
		str[tail] = 0;
		
		return new String(str);
	}
*/	
	
	/*public static void main(String[] args) {
		String str = new String("aabbcc");
		//Question1_3.removeDuplicateHS(str);
		System.out.println(str);
	}*/

}

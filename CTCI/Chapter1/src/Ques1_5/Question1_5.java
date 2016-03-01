/*
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string.
*/

/* Approaches that won't work:-
 * 1. HashMap<Character, Integer> count duplicates - this will count all instances of a 
 *    and answer will be a5b1c5 instead of a2b1c5a3
 * 2. Use boolean[] array to count duplicates - same as above

*/

public class Question1_5 {
	
	public static String stringCompression(String str) {
		if(str == null || str.isEmpty())	return str;		
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char last = str.charAt(0); // first char of str
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == last) { // repeated char
				count++;
			} else {
				sb.append(last);
				sb.append(count);
				count = 1;
				last = str.charAt(i);				
			}
		}
		
		sb.append(last);
		sb.append(count);
		
		if(sb.length() > str.length()) return str;
		
		return sb.toString();
	}

}

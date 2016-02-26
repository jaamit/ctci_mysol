/*
 * Write code to reverse a C-Style String. 
 * (C-String means that “abcd” is represented as five characters, including the null character.)
 * Java solution assumes a Java StringBuffer - char array backed with length
 */
import java.util.List;
import java.util.ArrayList;

public class Question1_2 {
	
	// 2 pointers-> start & end and swap chars
	public static void reverseString(StringBuffer sb) {
		int start = 0;
		int end   = sb.length();
		System.out.println(end);
		while(start < end) {
			char tmp = sb.charAt(start);
			char endC = sb.charAt(end-1);
			sb.setCharAt(end-1, tmp); // swap end with start chars
			sb.setCharAt(start, endC); // swap start with end chars			
			start++;
			end--;
		}		
	}
	
	// recursive implementation with Stack
	public static void reverseStringStack(StringBuffer sb) {
		List<Character> stack = new ArrayList<>();
		for(int i = 0; i < sb.length(); i++) {
			stack.add(0, sb.charAt(i));
		}
		
		for(int i = 0; i < sb.length(); i++) {
			sb.setCharAt(i, stack.get(i));
		}
		
	}
	
	// recursive implementation with Stack
	public static void reverseStringRecursive(StringBuffer sb) {
		sb.reverse();
	}

}

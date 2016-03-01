import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitQ1_9 {

	@Test
	public void testBasic() {
		assertEquals("Not%20yet%20implemented",
				     Question1_9.replaceSpacesBasic("Not yet implemented"));
	}
	
	@Test
	public void testReverse() {
		String str = "abc d e f";
		char[] arr = new char[str.length() + 3 * 2 + 1];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		//replaceSpaces(arr, str.length());
		//String str = "Not yet implemented";
		assertEquals("abc%20d%20e%20f",
				     Question1_9.replaceSpacesReverse(arr, str.length()));
	}

}

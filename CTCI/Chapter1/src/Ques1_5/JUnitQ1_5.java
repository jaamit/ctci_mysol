import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitQ1_5 {

	@Test
	public void testCompression() {
		//fail("Not yet implemented");
		assertEquals("a2b1c5a3", Question1_5.stringCompression("aabcccccaaa"));
	}
	
	@Test
	public void testNull() {
		//fail("Not yet implemented");
		assertEquals("", Question1_5.stringCompression(""));
	}
	
	@Test
	public void testNoCompression() {
		//fail("Not yet implemented");
		assertEquals("zxcvfdawer", Question1_5.stringCompression("zxcvfdawer"));
	}

}

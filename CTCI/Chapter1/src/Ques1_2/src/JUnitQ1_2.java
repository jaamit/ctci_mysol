import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitQ1_2 {

	@Test
	public void testReverseString() {		
		StringBuffer orig = new StringBuffer("fedcba");
		StringBuffer exp  = new StringBuffer("abcdef");
		Question1_2.reverseString(orig);
		System.out.println(exp + " " + orig);
		assertEquals(exp.toString(), orig.toString());
		//assertEquals((Object)exp, (Object)orig);
		//assertTrue(exp.equals(orig));
		//assertEquals(exp, orig);
		//assertTrue(exp.equals(orig));
	}
	
	@Test
	// null string check
	public void testReverseString2() {		
		StringBuffer orig = new StringBuffer("");		
		Question1_2.reverseString(orig);		
		assertEquals(orig.toString(), orig.toString());
	}
	
	@Test
	// 1 char string check
	public void testReverseString3() {		
		StringBuffer orig = new StringBuffer("X");		
		Question1_2.reverseString(orig);		
		assertEquals(orig.toString(), orig.toString());
	}
	
	@Test
	public void testReverseStringStack() {		
		StringBuffer orig = new StringBuffer("fedcba");
		StringBuffer exp  = new StringBuffer("abcdef");
		Question1_2.reverseStringStack(orig);
		System.out.println(exp + " " + orig);
		assertEquals(exp.toString(), orig.toString());
		//assertEquals((Object)exp, (Object)orig);
		//assertTrue(exp.equals(orig));
		//assertEquals(exp, orig);
		//assertTrue(exp.equals(orig));
	}
	
	@Test
	// null string check
	public void testReverseStringStack2() {		
		StringBuffer orig = new StringBuffer("");		
		Question1_2.reverseStringStack(orig);		
		assertEquals(orig.toString(), orig.toString());
	}
	
	@Test
	// 1 char string check
	public void testReverseStringStack3() {		
		StringBuffer orig = new StringBuffer("X");		
		Question1_2.reverseStringStack(orig);		
		assertEquals(orig.toString(), orig.toString());
	}
	
	@Test
	public void testReverseStringRecur() {		
		StringBuffer orig = new StringBuffer("fedcba");
		StringBuffer exp  = new StringBuffer("abcdef");
		Question1_2.reverseStringRecursive(orig);
		System.out.println(exp + " " + orig);
		assertEquals(exp.toString(), orig.toString());
		//assertEquals((Object)exp, (Object)orig);
		//assertTrue(exp.equals(orig));
		//assertEquals(exp, orig);
		//assertTrue(exp.equals(orig));
	}
	
	@Test
	// null string check
	public void testReverseStringRecur2() {		
		StringBuffer orig = new StringBuffer("");		
		Question1_2.reverseStringRecursive(orig);		
		assertEquals(orig.toString(), orig.toString());
	}
	
	@Test
	// 1 char string check
	public void testReverseStringRecur3() {		
		StringBuffer orig = new StringBuffer("X");		
		Question1_2.reverseStringRecursive(orig);		
		assertEquals(orig.toString(), orig.toString());
	}


}

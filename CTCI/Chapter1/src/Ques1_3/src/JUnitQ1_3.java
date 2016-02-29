import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JUnitQ1_3 {	
	//private boolean expected;
	private String actual;
	private String expected;
	
	public JUnitQ1_3(String actual, String expected) {
		//this.expected = expected;
		this.actual = actual;
		this.expected = expected;
	}
	
	@Parameters( name = "{index}: remDuplicates({0})={1}" )
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"abcde", "abcde"},
			{"", ""},
			{"aaaaa", "a" },
			{"aaabbbc", "abc" },
			{"bcdbdbcdbasbabccbdcbdsadas", "bcdas"}
			/*{"padle", true},
			{"hello", false},
			{"apple", false}*/
		});
		
	}
	
	@Test
	public void testremDuplicates() {
		assertEquals(expected, Question1_3.removeDuplicatesHashSet(actual));
		
	}
	
	@Test
	public void testIsAnagramHash() {
		assertEquals(expected, Question1_3.removeDuplicatesBoolean(actual));		
	}
	
}

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JUnitQ1_4 {
	private boolean expected;
	private String first;
	private String second;
	
	public JUnitQ1_4(boolean expected,
			                String first,
			                String second) {
		this.expected = expected;
		this.first = first;
		this.second = second;
	}
	
	@Parameters( name = "{index}: isAnagram({0})={1}" )
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			                {true, "", "" }, 
			                {true, "a", "a" },
			                {true, "Madam Curie", "Radium came"},
			                {false, "abcdef", "ghijkl"},
			                {false, "abcdef", "ghijkldjfs"}
			                //{true, 3, 4 }, { 9, 4, 5 }, });
		});
	}

	@Test
	public void testIsAnagramSort() {
		assertEquals(expected, Question1_4.isAnagramSort(first, second));
		
	}
	
	@Test
	public void testIsAnagramHash() {
		assertEquals(expected, Question1_4.isAnagramHash(first, second));
		
	}
	

}

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JUnitQ1_1 {	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"abcde", true},
			{"kite", true},
			{"padle", true},
			{"hello", false},
			{"apple", false}
		});
		
	}
	
	@Parameter
	public String fInput;
	
	@Parameter(value = 1)
	public boolean fExpected;
	
	@Test
	public void testisUniqueChars() {
		assertEquals(fExpected,Question1_1.isUniqueChars(fInput));
		}
	
	@Test
	public void testisUniqueChars2() {
		assertEquals(fExpected,Question1_1.isUniqueChars2(fInput));
		}
	
	@Test
	public void testisUniqueChars3() {
		assertEquals(fExpected,Question1_1.isUniqueChars3(fInput));
		}
	
	@Test
	public void testisUniqueChars4() {
		assertEquals(fExpected,Question1_1.isUniqueChars4(fInput));
		}
	}

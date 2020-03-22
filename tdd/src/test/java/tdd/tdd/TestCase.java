package tdd.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase {
	SourceCode ReplaceFirstTwo;
	@BeforeEach
	void Create()
	{
		ReplaceFirstTwo=new SourceCode();
	}

	@Test
	void test1Chars() {
		assertEquals("BCD",ReplaceFirstTwo.replace("ABCD"));
	}
	@Test
	void test2Chars() {
		assertEquals("CD",ReplaceFirstTwo.replace("AACD"));
	}
	@Test
	void test2ndChars() {	
		assertEquals("BCD",ReplaceFirstTwo.replace("BACD"));
	}
	@Test
	void testLastTwoChars() {	
		assertEquals("BBAA",ReplaceFirstTwo.replace("BBAA"));
	}
	@Test
	void testFirstTwoLastTwoChars() {	
		assertEquals("BAA",ReplaceFirstTwo.replace("AABAA"));
	}
	@Test
	void testNoChars() {	
		assertEquals("BCDHIJK",ReplaceFirstTwo.replace("BCDHIJK"));
	}
	@Test
	void testSingleChars1() {	
		assertEquals("",ReplaceFirstTwo.replace("A"));
	}
	@Test
	void testSingleChars2() {	
		assertEquals("B",ReplaceFirstTwo.replace("B"));
	}
	@Test
	void testEmptyChars() {	
		assertEquals("",ReplaceFirstTwo.replace(""));
	}
	@Test
	void testNullChars2() {	
		assertEquals(null,ReplaceFirstTwo.replace(null));
	}
	

}

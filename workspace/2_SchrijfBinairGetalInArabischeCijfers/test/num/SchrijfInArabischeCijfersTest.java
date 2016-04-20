package num;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class SchrijfInArabischeCijfersTest {
	
	@Test
	public void schrijfInArabischeCijfers() {
		assertEquals(0, GetalUtil.schrijfInArabischeCijfers(""));
		assertEquals(1, GetalUtil.schrijfInArabischeCijfers("1"));
		assertEquals(2, GetalUtil.schrijfInArabischeCijfers("10"));
		assertEquals(3, GetalUtil.schrijfInArabischeCijfers("11"));
		assertEquals(4, GetalUtil.schrijfInArabischeCijfers("100"));
		assertEquals(5, GetalUtil.schrijfInArabischeCijfers("101"));
		assertEquals(6, GetalUtil.schrijfInArabischeCijfers("110"));
		assertEquals(7, GetalUtil.schrijfInArabischeCijfers("111"));
		assertEquals(8, GetalUtil.schrijfInArabischeCijfers("1000"));
		assertEquals(9, GetalUtil.schrijfInArabischeCijfers("1001"));
		assertEquals(10, GetalUtil.schrijfInArabischeCijfers("1010"));
		assertEquals(11, GetalUtil.schrijfInArabischeCijfers("1011"));
		assertEquals(12, GetalUtil.schrijfInArabischeCijfers("1100"));
		assertEquals(13, GetalUtil.schrijfInArabischeCijfers("1101"));
		assertEquals(14, GetalUtil.schrijfInArabischeCijfers("1110"));
		assertEquals(15, GetalUtil.schrijfInArabischeCijfers("1111"));
		assertEquals(16, GetalUtil.schrijfInArabischeCijfers("10000"));
		assertEquals(17, GetalUtil.schrijfInArabischeCijfers("10001"));
		assertEquals(18, GetalUtil.schrijfInArabischeCijfers("10010"));
		assertEquals(19, GetalUtil.schrijfInArabischeCijfers("10011"));
		assertEquals(20, GetalUtil.schrijfInArabischeCijfers("10100"));
		assertEquals(5679548, GetalUtil.schrijfInArabischeCijfers("10101101010100110111100"));
	}

}


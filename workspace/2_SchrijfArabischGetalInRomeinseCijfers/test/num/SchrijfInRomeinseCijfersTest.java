package num;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class SchrijfInRomeinseCijfersTest {
	
	@Test
	public void individueleRomeinseGetallen() {
		assertEquals("I", GetalUtil.alsRomeinsCijfer(1));
		assertEquals("V", GetalUtil.alsRomeinsCijfer(5));
		assertEquals("X", GetalUtil.alsRomeinsCijfer(10));
		assertEquals("L", GetalUtil.alsRomeinsCijfer(50));
		assertEquals("C", GetalUtil.alsRomeinsCijfer(100));
		assertEquals("D", GetalUtil.alsRomeinsCijfer(500));
		assertEquals("M", GetalUtil.alsRomeinsCijfer(1000));
	}
	
	@Test
	public void optellendeRomeinseCijfers() {
		assertEquals("II", GetalUtil.alsRomeinsCijfer(2));
		assertEquals("III", GetalUtil.alsRomeinsCijfer(3));
		assertEquals("VI", GetalUtil.alsRomeinsCijfer(6));
		assertEquals("VII", GetalUtil.alsRomeinsCijfer(7));
		assertEquals("VIII", GetalUtil.alsRomeinsCijfer(8));
		assertEquals("XI", GetalUtil.alsRomeinsCijfer(11));
		assertEquals("XVII", GetalUtil.alsRomeinsCijfer(17));
		assertEquals("XXXVIII", GetalUtil.alsRomeinsCijfer(38));
		assertEquals("LXXII", GetalUtil.alsRomeinsCijfer(72));
		assertEquals("LXXX", GetalUtil.alsRomeinsCijfer(80));
		assertEquals("CXXII", GetalUtil.alsRomeinsCijfer(122));
		assertEquals("CLIII", GetalUtil.alsRomeinsCijfer(153));
		assertEquals("DCLXXVIII", GetalUtil.alsRomeinsCijfer(678));
		assertEquals("MCCXXXIII", GetalUtil.alsRomeinsCijfer(1233));
		assertEquals("MMMCCLXXII", GetalUtil.alsRomeinsCijfer(3272));
	}
	
	@Test
	public void aftrekkendeRomeinseCijfers() {
		assertEquals("IV", GetalUtil.alsRomeinsCijfer(4));
		assertEquals("IX", GetalUtil.alsRomeinsCijfer(9));
		assertEquals("XXXIX", GetalUtil.alsRomeinsCijfer(39));
		assertEquals("XLII", GetalUtil.alsRomeinsCijfer(42));
		assertEquals("XCIX", GetalUtil.alsRomeinsCijfer(99));
		assertEquals("CIX", GetalUtil.alsRomeinsCijfer(109));
		assertEquals("CXIX", GetalUtil.alsRomeinsCijfer(119));
		assertEquals("CXXIX", GetalUtil.alsRomeinsCijfer(129));
		assertEquals("CXXXIX", GetalUtil.alsRomeinsCijfer(139));
		assertEquals("CLXIX", GetalUtil.alsRomeinsCijfer(169));
		assertEquals("CDIII", GetalUtil.alsRomeinsCijfer(403));
		assertEquals("CMLXXIX", GetalUtil.alsRomeinsCijfer(979));
		assertEquals("MCMXCIX", GetalUtil.alsRomeinsCijfer(1999));
	}
}

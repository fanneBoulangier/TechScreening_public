package num;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class SchrijfInArabischeCijfersTest {
	
	@Test
	public void individueleRomeinseGetallen() {
		assertEquals(1, GetalUtil.alsArabischCijfer("I"));
		assertEquals(5, GetalUtil.alsArabischCijfer("V"));
		assertEquals(10, GetalUtil.alsArabischCijfer("X"));
		assertEquals(50, GetalUtil.alsArabischCijfer("L"));
		assertEquals(100, GetalUtil.alsArabischCijfer("C"));
		assertEquals(500, GetalUtil.alsArabischCijfer("D"));
		assertEquals(1000, GetalUtil.alsArabischCijfer("M"));
	}
	
	@Test
	public void optellendeRomeinseCijfers() {
		assertEquals(2, GetalUtil.alsArabischCijfer("II"));
		assertEquals(3, GetalUtil.alsArabischCijfer("III"));
		assertEquals(6, GetalUtil.alsArabischCijfer("VI"));
		assertEquals(7, GetalUtil.alsArabischCijfer("VII"));
		assertEquals(8, GetalUtil.alsArabischCijfer("VIII"));
		assertEquals(11, GetalUtil.alsArabischCijfer("XI"));
		assertEquals(17, GetalUtil.alsArabischCijfer("XVII"));
		assertEquals(38, GetalUtil.alsArabischCijfer("XXXVIII"));
		assertEquals(72, GetalUtil.alsArabischCijfer("LXXII"));
		assertEquals(80, GetalUtil.alsArabischCijfer("LXXX"));
		assertEquals(122, GetalUtil.alsArabischCijfer("CXXII"));
		assertEquals(153, GetalUtil.alsArabischCijfer("CLIII"));
		assertEquals(678, GetalUtil.alsArabischCijfer("DCLXXVIII"));
		assertEquals(1233, GetalUtil.alsArabischCijfer("MCCXXXIII"));
		assertEquals(3272, GetalUtil.alsArabischCijfer("MMMCCLXXII"));
	}
	
	@Test
	public void aftrekkendeRomeinseCijfers() {
		assertEquals(4, GetalUtil.alsArabischCijfer("IV"));
		assertEquals(9, GetalUtil.alsArabischCijfer("IX"));
		assertEquals(39, GetalUtil.alsArabischCijfer("XXXIX"));
		assertEquals(42, GetalUtil.alsArabischCijfer("XLII"));
		assertEquals(99, GetalUtil.alsArabischCijfer("XCIX"));
		assertEquals(109, GetalUtil.alsArabischCijfer("CIX"));
		assertEquals(119, GetalUtil.alsArabischCijfer("CXIX"));
		assertEquals(129, GetalUtil.alsArabischCijfer("CXXIX"));
		assertEquals(139, GetalUtil.alsArabischCijfer("CXXXIX"));
		assertEquals(169, GetalUtil.alsArabischCijfer("CLXIX"));
		assertEquals(979, GetalUtil.alsArabischCijfer("CMLXXIX"));
		assertEquals(1999, GetalUtil.alsArabischCijfer("MCMXCIX"));
	}
	
}

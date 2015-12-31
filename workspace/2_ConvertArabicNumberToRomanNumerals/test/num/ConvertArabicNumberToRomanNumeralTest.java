package num;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class ConvertArabicNumberToRomanNumeralTest {
	
	@Test
	public void individualRomanNumerals() {
		assertEquals("I", NumberUtil.asRomanNumeral(1));
		assertEquals("V", NumberUtil.asRomanNumeral(5));
		assertEquals("X", NumberUtil.asRomanNumeral(10));
		assertEquals("L", NumberUtil.asRomanNumeral(50));
		assertEquals("C", NumberUtil.asRomanNumeral(100));
		assertEquals("D", NumberUtil.asRomanNumeral(500));
		assertEquals("M", NumberUtil.asRomanNumeral(1000));
	}
	
	@Test
	public void romanNumeralsAddingUp() {
		assertEquals("II", NumberUtil.asRomanNumeral(2));
		assertEquals("III", NumberUtil.asRomanNumeral(3));
		assertEquals("VI", NumberUtil.asRomanNumeral(6));
		assertEquals("VII", NumberUtil.asRomanNumeral(7));
		assertEquals("VIII", NumberUtil.asRomanNumeral(8));
		assertEquals("XI", NumberUtil.asRomanNumeral(11));
		assertEquals("XVII", NumberUtil.asRomanNumeral(17));
		assertEquals("XXXVIII", NumberUtil.asRomanNumeral(38));
		assertEquals("LXXII", NumberUtil.asRomanNumeral(72));
		assertEquals("LXXX", NumberUtil.asRomanNumeral(80));
		assertEquals("CXXII", NumberUtil.asRomanNumeral(122));
		assertEquals("CLIII", NumberUtil.asRomanNumeral(153));
		assertEquals("DCLXXVIII", NumberUtil.asRomanNumeral(678));
		assertEquals("MCCXXXIII", NumberUtil.asRomanNumeral(1233));
		assertEquals("MMMCCLXXII", NumberUtil.asRomanNumeral(3272));
	}
	
	@Test
	public void romanNumeralsSubtracting() {
		assertEquals("IV", NumberUtil.asRomanNumeral(4));
		assertEquals("IX", NumberUtil.asRomanNumeral(9));
		assertEquals("XXXIX", NumberUtil.asRomanNumeral(39));
		assertEquals("XLII", NumberUtil.asRomanNumeral(42));
		assertEquals("XCIX", NumberUtil.asRomanNumeral(99));
		assertEquals("CIX", NumberUtil.asRomanNumeral(109));
		assertEquals("CXIX", NumberUtil.asRomanNumeral(119));
		assertEquals("CXXIX", NumberUtil.asRomanNumeral(129));
		assertEquals("CXXXIX", NumberUtil.asRomanNumeral(139));
		assertEquals("CLXIX", NumberUtil.asRomanNumeral(169));
		assertEquals("CDIII", NumberUtil.asRomanNumeral(403));
		assertEquals("CMLXXIX", NumberUtil.asRomanNumeral(979));
		assertEquals("MCMXCIX", NumberUtil.asRomanNumeral(1999));
	}
}

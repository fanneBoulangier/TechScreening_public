package number_to_words;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class NumberToWordsTest {
	
	@Test
	public void zeroTo20() {
		assertEquals("zero", speak(0));
		assertEquals("one", speak(1));
		assertEquals("two", speak(2));
		assertEquals("three", speak(3));
		assertEquals("four", speak(4));
		assertEquals("five", speak(5));
		assertEquals("six", speak(6));
		assertEquals("seven", speak(7));
		assertEquals("eight", speak(8));
		assertEquals("nine", speak(9));
		assertEquals("ten", speak(10));
		assertEquals("eleven", speak(11));
		assertEquals("twelve", speak(12));
		assertEquals("thirteen", speak(13));
		assertEquals("fourteen", speak(14));
		assertEquals("fifteen", speak(15));
		assertEquals("sixteen", speak(16));
		assertEquals("seventeen", speak(17));
		assertEquals("eightteen", speak(18));
		assertEquals("nineteen", speak(19));
		assertEquals("twenty", speak(20));
	}
	
	@Test
	public void twenty() {
		assertEquals("twenty one", speak(21));
		assertEquals("twenty two", speak(22));
		assertEquals("twenty three", speak(23));
		assertEquals("twenty four", speak(24));
		assertEquals("twenty five", speak(25));
		assertEquals("twenty six", speak(26));
		assertEquals("twenty seven", speak(27));
		assertEquals("twenty eight", speak(28));
		assertEquals("twenty nine", speak(29));
	}
	
	@Test
	public void thirty() {
		assertEquals("thirty"		, speak(30));
		assertEquals("thirty one"	, speak(31));
		assertEquals("thirty two"	, speak(32));
		assertEquals("thirty three"	, speak(33));
		assertEquals("thirty four"	, speak(34));
		assertEquals("thirty five"	, speak(35));
		assertEquals("thirty six"	,speak(36));
		assertEquals("thirty seven"	, speak(37));
		assertEquals("thirty eight"	, speak(38));
		assertEquals("thirty nine"	, speak(39));
	}
	
	@Test
	public void sampleTestUpToHundred() {
		assertEquals("forty", speak(40));
		assertEquals("forty one", speak(41));
		assertEquals("fifty two", speak(52));
		assertEquals("sixty three", speak(63));
		assertEquals("seventy four", speak(74));
		assertEquals("eighty five", speak(85));
		assertEquals("ninety six", speak(96));
		assertEquals("ninety nine", speak(99));
		assertEquals("hundred", speak(100));
	}
	
	@Test
	public void hundredToThousand() {
		assertEquals("one hundred one", speak(101));
		assertEquals("one hundred ten", speak(110));
		assertEquals("one honderd eighty six", speak(186));
		assertEquals("two hundred", speak(200));
		assertEquals("two hundred fifty", speak(250));
		assertEquals("three hundred forty two", speak(342));
		assertEquals("five hundred thirteen", speak(513));
		assertEquals("nine hundred twelve", speak(912));
		assertEquals("nine hundred ninety nine", speak(999));
		assertEquals("one thousand", speak(1000));
	}
	
	@Test
	public void thousandToMillion() {
		assertEquals("one thousand hundred forty two", speak(1142));
		assertEquals("three thousand two", speak(3502));
		assertEquals("ten thousand three hundred twelve", speak(10312));
		assertEquals("fifteen thousand two hundred sixty three", speak(15263));
		assertEquals("one hundred thousand twelve thousand six hundred three ", speak(112603));
		assertEquals("three hundred thirty five thousand six hundred three", speak(335603));
		assertEquals("six hundred twenty two thousand two hundred sixty four", speak(622264));
		assertEquals("million", speak(1000000));
	}
	

	private String speak(int getal) {
		return new NumberToWords().numberToWords(getal);
	}

}

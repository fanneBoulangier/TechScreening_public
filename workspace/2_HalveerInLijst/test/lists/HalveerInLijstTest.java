package lists;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class HalveerInLijstTest {

	@Test(expected=IllegalArgumentException.class)
	public void halveerInLijstVanNulIsOngeldig() {
		ListUtil.halveerInLijst(0);
	}
	
	@Test
	public void halveerInLijstVanEen() {
		assertEquals(asList(1), ListUtil.halveerInLijst(1));
	}
	
	@Test
	public void halveerInLijstTwee() {
		assertEquals(asList(2, 1), ListUtil.halveerInLijst(2));
	}
	
	@Test
	public void halveerInLijstGrotereGetallen() {
		assertEquals(asList(100, 50, 25, 12, 6, 3, 1), ListUtil.halveerInLijst(100));
	}
}

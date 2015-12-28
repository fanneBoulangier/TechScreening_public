package listutils;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class FindMinValueInListTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void emptyListThrowsIllegalArgumentException(){
		ListUtil.findMinValueInList();
	}
	
	@Test
	public void returnSmallest() {
		assertEquals(new Integer(1), ListUtil.findMinValueInList(4, 2, 1, 5, 3, 1, 5, 9));
	}

}

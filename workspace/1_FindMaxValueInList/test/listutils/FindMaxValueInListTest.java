package listutils;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class FindMaxValueInListTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void emptyListThrowsException() {
		ListUtil.findMaxValueInList();
	}
	
	@Test
	public void listWithOneElement() {
		assertEquals(new Integer(2), ListUtil.findMaxValueInList(2));
	}
	
	@Test
	public void listWithMoreElementsMaxValueFirst() {
		assertEquals(new Integer(2), ListUtil.findMaxValueInList(2, 1, 0, 1));
	}
	
	@Test
	public void listWithMoreElementsMaxValueInTheMiddle() {
		assertEquals(new Integer(2), ListUtil.findMaxValueInList(1, 1, 0, 1, 2, 1));
	}
	
	@Test
	public void listWithMoreElementsMaxValueLast() {
		assertEquals(new Integer(2), ListUtil.findMaxValueInList(1, 1, 1, 1, 0, 2));
	}
	

}

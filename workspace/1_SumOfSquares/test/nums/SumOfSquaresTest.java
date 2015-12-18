package nums;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class SumOfSquaresTest {
	
	@Test
	public void emptyList() {
		assertEquals(new Integer(0), ListUtil.sumOfSquares(new ArrayList<Integer>()));
	}
	
	@Test
	public void sumOfSquares() {
		assertEquals(new Integer(55), ListUtil.sumOfSquares(Arrays.asList(1, 2, 3, 4, 5)));
	}

}

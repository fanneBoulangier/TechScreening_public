package listutil;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ZelfdePariteitTest {
	
	@Test
	public void legeLijst()  {
		assertEquals(new ArrayList<Integer>(), ListUtil.zelfdePariteit(1, new ArrayList<Integer>()));
	}
	
	@Test
	public void oneven()  {
		assertEquals(asList(1, 3, 5, 7, 9), ListUtil.zelfdePariteit(1, asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
	}
	
	@Test
	public void even()  {
		assertEquals(asList(2, 4, 6, 8, 10), ListUtil.zelfdePariteit(2, asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
	}

}

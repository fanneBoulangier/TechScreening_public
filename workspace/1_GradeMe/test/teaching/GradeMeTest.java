package teaching;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class GradeMeTest {

	@Test(expected=IllegalArgumentException.class)
	public void canNotGradeBelowZero() {
		Teacher.gradeMe(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void canNotGradeHigherThan100() {
		Teacher.gradeMe(101);
	}
	
	@Test
	public void normalGrades() {
		assertGrade('F', 0, 50);
		assertGrade('E', 51, 59);
		assertGrade('D', 60, 69);
		assertGrade('C', 70, 79);
		assertGrade('B', 80, 89);
		assertGrade('A', 90, 100);
		
	}
	
	private void assertGrade(char expectedGrade, int startPercentage, int endPercentage) {
		for (int aPercentage = startPercentage; aPercentage <= endPercentage; aPercentage++) {
			assertEquals(expectedGrade, Teacher.gradeMe(aPercentage));
		}
	}
}

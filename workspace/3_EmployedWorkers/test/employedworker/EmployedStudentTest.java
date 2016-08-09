package employedworker;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployedStudentTest {
	
		
	@Test
	public void testUNumber() {
		EmployedStudent tom = new EmployedStudent("tom",1000);
		EmployedStudent bob = new EmployedStudent("bob",1200);
		assertFalse(tom.getUNumber() == bob.getUNumber());		
	}
	
	@Test
	public void testYearSalary() {
		EmployedStudent tom = new EmployedStudent("tom",1000);
		assertEquals(12000, tom.getYearSalary());
	}
}

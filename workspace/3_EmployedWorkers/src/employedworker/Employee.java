package employedworker;

/**
 * An Employee has a year salary, calculated using the month salary.
 */
public class Employee {
	
	private int monthSalary;

	public Employee(int monthSalary) {
		this.monthSalary = monthSalary;
	}	
		
	public int getYearSalary() {
		return 12 * monthSalary;
	}

}

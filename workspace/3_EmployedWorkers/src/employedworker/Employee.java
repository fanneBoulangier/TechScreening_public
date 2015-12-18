package employedworker;

/**
 * Een Employee heeft een jaarsalaris, berekend op basis van zijn maandsalaris
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

package employedworker;

/**
 * A Student has a unique student number
 */
public class Student {
	
	private long uNumber;
	
	public Student(String name) {	
		this.uNumber = name.hashCode()+System.currentTimeMillis();
	}
		
	public long getUNumber() {
		return uNumber;
	}
}

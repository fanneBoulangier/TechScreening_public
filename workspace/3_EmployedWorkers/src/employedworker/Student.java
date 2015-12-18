package employedworker;

/**
 * Een Student heeft een uniek studentnummer
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

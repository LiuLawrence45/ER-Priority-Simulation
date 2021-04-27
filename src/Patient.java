/**
 * Patient class including patient priority
 * Implement Comparable interface
 * 
 * @author lawrenceliu
 *
 */
public class Patient implements Comparable<Patient>{
	
	static int order;
	String first;
	String last;
	int priority;
	
	/**
	 * Constructor
	 * @param first
	 * @param last
	 * @param priority
	 */
	public Patient(String first, String last, int priority) {
		this.first= first;
		this.last = last;
		this.priority = priority;
	}
	
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public int getPriority() {
		return priority;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	/**
	 * Compare this patient to other patient
	 * Compare first and last name
	 * @param Patient other
	 */
	public int compareTo(Patient other) {
		if (first.compareTo(other.getFirst()) > 0) {
			return 1;
		}
		else if (first.compareTo(other.getFirst()) < 0) {
			return -1;
		}
		else {
			if (last.compareTo(other.getLast()) > 0) {
				return 1;
			}
			else if (last.compareTo(other.getLast()) < 0) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}
	
	

}

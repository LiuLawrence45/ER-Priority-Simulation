/**
 * Patient class including patient priority
 * Implement Comparable interface
 * 
 * @author lawrenceliu
 *
 */
public class Patient implements Comparable<Patient>{
	
	
	String first;
	String last;
	int priority;
	int order = 0;
	
	/**
	 * Constructor
	 * @param first
	 * @param last
	 * @param priority
	 */
	public Patient(String first, String last, int priority, int order) {
		this.first= first;
		this.last = last;
		this.priority = priority;
		this.order = order;
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
	public int getOrder() {
		return order;
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
		if (priority > other.getPriority()) {
			return 1;
		}
		else if (priority < other.getPriority()) {
			return -1;
		}
		else {
			if (order < other.getOrder()) {
				return 1;
			}
			return -1;
		}
	}
	
	public String toString() {
		String temp = first + " " + last + " "  + priority;
		//String temp = priority + " " + order;
		
		return temp;
	}

}

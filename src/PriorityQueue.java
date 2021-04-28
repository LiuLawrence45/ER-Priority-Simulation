/**
 * Priority Queue for Patients
 * @author lawrenceliu
 *
 */

import java.util.*;

public class PriorityQueue<E extends Comparable<E>> implements PureQueue<E>{
	
	ArrayList<E> queue = new ArrayList<E>();
	
	/**
	 * Dequeue value from root
	 * @return E
	 */
	public E dequeue() {
		if (queue.size() == 0) {
			throw new NoSuchElementException("Queue is empty");
			
		}
		else {
			E returnto = queue.get(0);
			E temp = queue.get(queue.size() - 1);
			queue.set(queue.size() - 1, null);
			queue.set(0,temp);
			
			int current = 0;
			while (queue.get(current).compareTo(getRightVal(current)) > 0
					|| queue.get(current).compareTo(getLeftVal(current)) > 0) {
				
				if (getLeftVal(current).compareTo(getRightVal(current)) < 0) {
					swap(current, getLeft(current));
					current = getLeft(current);
				}
				else if (getLeftVal(current).compareTo(getRightVal(current)) > 0) {
					swap(current, getRight(current));
					current = getRight(current);
				}
				
			}
			return returnto;
			
			
			
			
		}
	}

	/**
	 * Swap two indices
	 * @param one
	 * @param two
	 */
	private void swap(int one, int two) {
		E temp = queue.get(one);
		queue.set(one, queue.get(two));
		queue.set(two, temp);
	}

	private int getRight(int current) {
		return (current*2+2);
	}
	private int getLeft(int current) {
		return (current*2+1);
	}
	
	private E getRightVal(int current) {
		return queue.get(current*2+2);
	}
	private E getLeftVal(int current) {
		return queue.get(current*2+1);
	}
	
	private int getParent(int current) {
		return current/2;
	}
	private E getParentVal(int current) {
		return queue.get(current/2);
	}


	public void enqueue(E object) {
		queue.add(object);
		
		int current = queue.size()-1;
		while (queue.get(current).compareTo(getParentVal(current)) > 0) {
			swap(current,getParent(current));
			current = getParent(current);
		}
		
		
		}

	public E peek() {
		return queue.get(0);
	}

	public boolean isEmpty() {
		return queue.size() == 0;
	}
	

}
